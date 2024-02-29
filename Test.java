public class Test {
    public static void main(String[] args) {

        //  GenericClasses projemizde olduğu gibi burada da 4 tane farklı veri tipinde dizimiz var.  //  1

        /*  4 dizi var. 4 metod yazmak yerine 1 generic metod yazacağız. Aksi durumda 20 dizi olsa 20 tane ayrı metod
        yazmamız gerekecekti. */  //  2


        /* Character[] char_dizi = {'J','A','V','A'};

        Integer[] int_dizi = {1,2,3,4,5,6};

        String[] string_dizi = {"Java","Python","C++","Php"};

        Ogrenci[] ogrenci_dizi = {new Ogrenci("Direncan"), new Ogrenci("Mustafa"), new Ogrenci("Mehmet")};

        yazdir(char_dizi);  //  8
        yazdir(int_dizi);  //  9
        yazdir(string_dizi);  //  10
        yazdir(ogrenci_dizi);  //  11 */ // Bu kısmı komple yoruma aldık.  //  23


        Sayisal sayisal1 = new Sayisal(30,40,20,30);  //  26
        Sayisal sayisal2 = new Sayisal(25,45,2,35);  //  27

        /*  Şimdi aşağıda mainmetodu dışına bu iki sayısal öğrencinin puanını karşılaştıran ve hangisini puanı yüksekse
            onu döndüren bir metod yazalım. */  //  28

        Sayisal birinci = birinci(sayisal1,sayisal2);  /*  Hangisi büyük ise parantez içerisine o döenecek ve birincinin
                                                           referansı o objemizin referansı olacak. */  //  32

        System.out.println("Birinci Sayisal Öğrencisinin Puanı : " + birinci.puanHesapla());  //  33

        EsitAgirlik esitagirlik1 = new EsitAgirlik(30,20,40,2);  //  34
        EsitAgirlik esitagirlik2 = new EsitAgirlik(40,10,50,0);  //  35

        EsitAgirlik birinci2 = birinci(esitagirlik1, esitagirlik2);  /*  Burada hata aldık. Çünkü aşağıda yazmış olduğumuz
                                                                         metodun parantez içerisinde bir tane Sayisal objesi bekliyor
                                                                         fakat biz burada EsitAgirlik gönderdik.
                                                                         Burada problemimizi generic metod çözecek.
                                                                         Aşağıdaki metodu generic metoda göre yeniden düzenleyeceğiz. Sayisal
                                                                         yazan yerleri E olarak değiştireceğiz. */  //  36

        System.out.println("Birinci Eşit Ağırlık Öğrencisinin Puanı : " + birinci2.puanHesapla());  //  38

    }
    /*private static class Ogrenci {  //  Ogrenci[] dizisi hata verdiği için static inner class oluşturdum.  //  3

        private String isim;  //  4

        public Ogrenci(String isim) {  //  Ogrenci[] dizisi hala hata verdiği için constructor oluşturdum.  //  5
            this.isim = isim;
        }

        @Override
        public String toString() {  /* Generate diyerek toString() yazdırdık. Bunu yazdırmadan evvel projeyi çalıştırdığımızda
                                       yazdir(ogrenci_dizi); metod çıktısı abuk sabuk görünüyordu. Bunu yazdığımızda düzeldi.  //  6
            return "İsim :" + isim;
        }
    } */  //  Burayı da yoruma aldık.  //  24

    /*public static <E> void yazdir(E[] dizi) {  // Generic metodumuzu yazdık.  //  7

        for (E e : dizi) {

            System.out.println(e);

        }

    } */ // Bu metodu da yoruma aldık.  //  25

    //  Şimdi Aday isimli bir abstract class oluşturarak içerisine 2 adet alt sınıf türeteceğiz.  //  7

    /* public static Sayisal birinci(Sayisal s1, Sayisal s2) { /* Sayisal öğrencileri birbirleri ile kıyasladığımız ve puanı
                                                               yüksek olan öğrenciyi döndürdüğümüz bir metod yazacağız.
                                                                Dönüş tipimiz Sayisal olacak. */  //  29
    public static <E extends Aday> E birinci(E e1, E e2) {  /* Sayisalların yerine E, s1 ve s2 lerin yerine de e1 ve e2 yazdık.
                                                  Fakat bir alt satırdaki if koşullu durum parantezinin içerisindeki
                                                  paunHesapla kısımları kırmızı görünerek hata vermeye devam etti.
                                                  Bunun nedeni de yukarı yazmış olduğumuz <E> nin çok genel bir <E> oluşu.
                                                  Yani bu <E> nin içerisine her türlü veri tipi gelebilir olduğu için
                                                  java bize problem çıkarmaya devam etti.
                                                  Biz burada sadece Aday classını extend eden veri tiplerini göndereceğimizi
                                                  javaya söyleyeceğiz. Bunu yapmak için de <E> nin içerisine extends Aday yazıyoruz.
                                                  <E extends Aday> şeklinde. */  //  37

        if (e1.puanHesapla() > e2.puanHesapla()) {  //  30

            return e1;
        }
        else {
            return e2;
        }
    }

    // Şimdi yukarıda bu metodu kullanalım.  //  31


}

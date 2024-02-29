public class Sayisal extends Aday {  //  Abstract Aday classından extend ettik.  //  14


    public Sayisal(int turkce, int matematik, int edebiyat, int fizik) {  // Hata verdiği için Aday classından constructor ekledik. //  15
        super(turkce, matematik, edebiyat, fizik);
    }

    @Override
    public int puanHesapla() {  /*  Hata vermeye devam ettiği için Aday abstract classındaki metodu implement ettik.
                                    Başında public yoktu. public ekledik. */  //  16

        /*  Şimdi metodun içini dolduralım. Sayısal öğrencisi Türkçe ve Matematikten 5 puan, Edebiyattan 1 puan ve Fizikten
            ise 4 puan alsın. */  //  17

        return getTurkce() * 5 + getMatematik() * 5 + getFizik() * 4 + getEdebiyat() * 1;

    }

    // Şimdi de EsitAgirlik class'ını dolduralım. //  18


}

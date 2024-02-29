public abstract class Aday {  //  8

    // Öğrencinin derslerden aldığı netleri özellik olarak int veri tipinde yazıyoruz. //  9

    private int turkce;
    private int matematik;
    private int edebiyat;
    private int fizik;

    public Aday(int turkce, int matematik, int edebiyat, int fizik) {  //  Constructor oluşturduk.  //  10
        this.turkce = turkce;
        this.matematik = matematik;
        this.edebiyat = edebiyat;
        this.fizik = fizik;
    }

    public int getTurkce() {  // Getter Setter metodları oluşturduk.  //  11
        return turkce;
    }

    public void setTurkce(int turkce) {
        this.turkce = turkce;
    }

    public int getMatematik() {
        return matematik;
    }

    public void setMatematik(int matematik) {
        this.matematik = matematik;
    }

    public int getEdebiyat() {
        return edebiyat;
    }

    public void setEdebiyat(int edebiyat) {
        this.edebiyat = edebiyat;
    }

    public int getFizik() {
        return fizik;
    }

    public void setFizik(int fizik) {
        this.fizik = fizik;
    }

    abstract int puanHesapla ();  //  Abstract metodumuzu yazdık.  //  Sayısalcı ve Sözelci için ayrı gövdeler yazılacak.  //  12

    //  Şimdi Sayisal ve EsitAgirlik adında iki yeni class oluşturalım.  //  13

}

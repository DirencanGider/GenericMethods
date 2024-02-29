public class EsitAgirlik extends Aday {  //  18

    public EsitAgirlik(int turkce, int matematik, int edebiyat, int fizik) {  //  19
        super(turkce, matematik, edebiyat, fizik);
    }

    @Override
    public int puanHesapla() {  //  20

        return getTurkce() * 5 + getMatematik() * 5 + getFizik() * 1 + getEdebiyat() * 4;  //  21
    }

    /*  Şimdi EsitAgirlik class'ını da tamamladık. Asıl önemli kısım bunlarla beraber nasıl generic metod yazacağımız.
        Test.java ya geri dönelim bu aşamada. */  //  22

}

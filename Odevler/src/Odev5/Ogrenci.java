package Odev4;

class Ogrenci extends Kisi {
    private int ogrenciNo;

    public Ogrenci(String ad, String soyad, int ogrenciNo) {
        super(ad, soyad);
        this.ogrenciNo = ogrenciNo;
    }

    public int getOgrenciNo() {
        return ogrenciNo;
    }
}

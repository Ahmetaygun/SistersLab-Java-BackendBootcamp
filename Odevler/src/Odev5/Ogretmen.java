package Odev4;

class Ogretmen extends Kisi {
    private String brans;

    public Ogretmen(String ad, String soyad, String brans) {
        super(ad, soyad);
        this.brans = brans;
    }

    public String getBrans() {
        return brans;
    }
}

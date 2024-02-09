package Odev4;

public class Kisi {
    // Kişi sınıfı (Öğrenci ve Öğretmen sınıflarının atası)

        private String ad;
        private String soyad;

        public Kisi(String ad, String soyad) {
            this.ad = ad;
            this.soyad = soyad;
        }

        public String getAd() {
            return ad;
        }

        public String getSoyad() {
            return soyad;
        }
    }
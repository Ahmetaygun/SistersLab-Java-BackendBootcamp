import java.util.Scanner;

//KDVFiyatiHesaplama
/*
 Soru1:
 Switch-case kullanmadan gerekiyorsa if kullan
 kullanicidan alinan para degerinin KDV'li fiyatini ve KDV tutarini hesaplayip ekrana bastiran programi yazin.
 */
public class soru1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double kdvOrani = 0.30; // KDV oranı %30

        System.out.print("Lütfen ürünün KDV'siz fiyatını girin: ");
        double urunFiyati = scanner.nextDouble();

        double kdvSizFiyat = urunFiyati;

        // KDV'li fiyatın hesaplanması
        double kdvliFiyat = urunFiyati + (urunFiyati * kdvOrani);

        // KDV tutarının hesaplanması
        double kdvTutari = urunFiyati * kdvOrani;

        System.out.println("KDV'siz Fiyat: " + kdvSizFiyat);
        System.out.println("KDV'li Fiyat: " + kdvliFiyat);
        System.out.println("KDV Tutarı: " + kdvTutari);
    }
}

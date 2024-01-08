import java.util.Scanner;

//BasitHesapMakinesi
/*
 Soru4:
 Switch-case kullanmadan gerekiyorsa if kullan
 Basit Hesap Makinesi
 Kullanicidan iki sayi girmesini isteyen ve ardindan bu iki sayi uzerinde toplama, cikarma, carpma
 ve bolme islemlerini gerceklestiren bir Java programi yazin.
 */
public class soru4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("İlk sayıyı girin: ");
        double sayi1 = scanner.nextDouble();

        System.out.print("İkinci sayıyı girin: ");
        double sayi2 = scanner.nextDouble();

        System.out.println("Yapmak istediğiniz işlemi seçin:");
        System.out.println("1 - Toplama");
        System.out.println("2 - Çıkarma");
        System.out.println("3 - Çarpma");
        System.out.println("4 - Bölme");

        int secim = scanner.nextInt();
        double sonuc = 0;

        if (secim == 1) {
            sonuc = sayi1 + sayi2;
        } else if (secim == 2) {
            sonuc = sayi1 - sayi2;
        } else if (secim == 3) {
            sonuc = sayi1 * sayi2;
        } else if (secim == 4) {
            if (sayi2 != 0) {
                sonuc = sayi1 / sayi2;
            } else {
                System.out.println("Bir sayı sıfıra bölünemez.");
            }
        } else {
            System.out.println("Geçersiz seçim.");
        }

        System.out.println("Sonuç: " + sonuc);

    }
}

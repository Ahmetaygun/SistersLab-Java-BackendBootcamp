import java.util.Scanner;

//HesapMakinesi
/*
 Soru8:
 Switch-case kullan
 Kullanicdan iki deger alan ve kullanicinin toplama,cikarma,bolme,carpa islemlerinden
 birisini sectigi bir hesap makinesi uygulamasi yapin
 */
public class soru8 {
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

        switch (secim) {
            case 1:
                sonuc = sayi1 + sayi2;
                break;
            case 2:
                sonuc = sayi1 - sayi2;
                break;
            case 3:
                sonuc = sayi1 * sayi2;
                break;
            case 4:
                if (sayi2 != 0) {
                    sonuc = sayi1 / sayi2;
                } else {
                    System.out.println("Bir sayı sıfıra bölünemez.");
                    System.exit(0);
                }
                break;
            default:
                System.out.println("Geçersiz seçim.");
                System.exit(0);
                break;
        }

        System.out.println("Sonuç: " + sonuc);

    }
}

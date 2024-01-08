import java.util.Scanner;

//KDVHesaplama
/*
 Soru2:
 Switch-case kullanmadan gerekiyorsa if kullan
 Eger girilen tutar 0 ve 1000 TL arasinda ise KDV orani %10 , tutar 1000 TL'den buyuk ise KDV oranini %22 olarak
 KDV tutari hesaplayan programi yaziniz.
*/
public class soru2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ürünün fiyatını girin: ");
        double fiyat = scanner.nextDouble();

        double kdvOrani;

        if (fiyat >= 0 && fiyat <= 1000) {
            kdvOrani = 0.10; // 0 ile 1000 TL arası KDV oranı %10
        } else {
            kdvOrani = 0.22; // 1000 TL'den büyük ise KDV oranı %22
        }

        double kdvTutari = fiyat * kdvOrani;
        double kdvliFiyat = fiyat + kdvTutari;

        System.out.println("KDV'li fiyat: " + kdvliFiyat);
        System.out.println("KDV tutarı: " + kdvTutari);

    }
}

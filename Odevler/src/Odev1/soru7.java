import java.util.Scanner;

//HavaDurumu
/*
 Soru7:
 Switch-case kullan
 Kullaniciya bir hava durumu kodu girmesini isteyin. Girdigi koda gore hava durumunu ekrana yazdirin.
 */
public class soru7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hava durumu kodunu girin (1-3 arası bir sayı):");
        int havaKodu = scanner.nextInt();

        String havaDurumu = "";

        switch (havaKodu) {
            case 1:
                havaDurumu = "Güneşli";
                break;
            case 2:
                havaDurumu = "Bulutlu";
                break;
            case 3:
                havaDurumu = "Yağmurlu";
                break;
            default:
                havaDurumu = "Geçersiz hava durumu kodu";
                break;
        }

        System.out.println("Hava durumu: " + havaDurumu);

    }
}

package Odev2;
//hesap makinesi
import java.util.Scanner;

public class soru5 {
    public static double toplama(double sayi1, double sayi2) {
        return sayi1 + sayi2;
    }
    public static double cikarma(double sayi1, double sayi2) {
        return sayi1 - sayi2;
    }
    public static double carpma(double sayi1, double sayi2) {
        return sayi1 * sayi2;
    }
    public static double bolme(double sayi1, double sayi2) {
        if (sayi2 != 0) {
            return sayi1 / sayi2;
        } else {
            System.out.println("Hata: Sıfıra bölme hatası!");
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci sayıyı girin: ");
        double sayi1 = scanner.nextDouble();

        System.out.print("İkinci sayıyı girin: ");
        double sayi2 = scanner.nextDouble();

        System.out.print("İşlemi seçin (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double sonuc = 0.0;

        switch (operator) {
            case '+':
                sonuc = toplama(sayi1, sayi2);
                break;
            case '-':
                sonuc = cikarma(sayi1, sayi2);
                break;
            case '*':
                sonuc = carpma(sayi1, sayi2);
                break;
            case '/':
                sonuc = bolme(sayi1, sayi2);
                break;
            default:
                System.out.println("Geçersiz operatör!");
                return;
        }

        System.out.println("Sonuç: " + sonuc);
    }
}

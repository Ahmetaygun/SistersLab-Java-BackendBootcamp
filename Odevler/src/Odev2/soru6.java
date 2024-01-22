package Odev2;
//Ebob ve Ekok bulma
import java.util.Scanner;

public class soru6 {
    public static int ebobHesapla(int sayi1, int sayi2) {
        while (sayi2 != 0) {
            int temp = sayi2;
            sayi2 = sayi1 % sayi2;
            sayi1 = temp;
        }
        return sayi1;
    }
    public static int ekokHesapla(int sayi1, int sayi2) {
        return (sayi1 * sayi2) / ebobHesapla(sayi1, sayi2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci sayıyı girin: ");
        int sayi1 = scanner.nextInt();

        System.out.print("İkinci sayıyı girin: ");
        int sayi2 = scanner.nextInt();

        int ebob = ebobHesapla(sayi1, sayi2);
        int ekok = ekokHesapla(sayi1, sayi2);

        System.out.println("EBOB: " + ebob);
        System.out.println("EKOK: " + ekok);
    }
}

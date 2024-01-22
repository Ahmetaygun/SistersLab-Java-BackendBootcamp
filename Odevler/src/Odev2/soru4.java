package Odev2;

import java.util.Scanner;


public class soru4 {
    public static int asalKontrol(int sayi) {
        if (sayi < 2) {
            return -1;
        }

        for (int i = 2; i <= Math.sqrt(sayi); i++) {
            if (sayi % i == 0) {
                return 0;
            }
        }

        return 1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        int sonuc = asalKontrol(sayi);

        switch (sonuc) {
            case 0:
                System.out.println(sayi + " sayısı asal değildir.");
                break;
            case 1:
                System.out.println(sayi + " sayısı asaldır.");
                break;
            case -1:
                System.out.println(sayi + " sayısı 2'den küçük olduğu için asal değildir.");
                break;
            default:
                System.out.println("Beklenmeyen bir durum oluştu.");
        }
    }

}


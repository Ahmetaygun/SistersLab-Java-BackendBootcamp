package Odev3;

import java.util.HashMap;
import java.util.Scanner;

//Soru1: Ogrenci Notlari
//Bir ogrenci not takip sistemi yazin. Her ogrencinin adini anahtar, notunu deger olarak iceren bir HashMap kullanarak,
//kullaniciya ogrenci eklemesini ve bir ogrencinin notunu sorgulamasini saglayan bir program yapin.

public class soru1 {

    private static void ogrenciEkle(Scanner scanner, HashMap<String, Integer> notlar) {
        System.out.print("Öğrenci adını girin: ");
        String ogrenciAdi = scanner.nextLine();

        System.out.print("Öğrenci notunu girin: ");
        int ogrenciNotu = scanner.nextInt();
        scanner.nextLine();

        notlar.put(ogrenciAdi, ogrenciNotu);
        System.out.println(ogrenciAdi + " öğrencisi başarıyla eklendi.");
    }

    private static void notSorgula(Scanner scanner, HashMap<String, Integer> notlar) {
        System.out.print("Sorgulamak istediğiniz öğrenci adını girin: ");
        String ogrenciAdi = scanner.nextLine();

        Integer not = notlar.get(ogrenciAdi);

        if (not != null) {
            System.out.println(ogrenciAdi + " öğrencisinin notu: " + not);
        } else {
            System.out.println(ogrenciAdi + " öğrencisi bulunamadı.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> notlar = new HashMap<>();

        while (true) {
            System.out.println("1 - Öğrenci Ekle");
            System.out.println("2 - Not Sorgula");
            System.out.println("3 - Çıkış");
            System.out.print("Seçiminizi yapın: ");

            int secim = scanner.nextInt();
            scanner.nextLine();

            switch (secim) {
                case 1:
                    ogrenciEkle(scanner, notlar);
                    break;
                case 2:
                    notSorgula(scanner, notlar);
                    break;
                case 3:
                    System.out.println("Programdan çıkılıyor...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Geçersiz seçim. Lütfen tekrar deneyin.");
                    break;
            }
        }
    }

}

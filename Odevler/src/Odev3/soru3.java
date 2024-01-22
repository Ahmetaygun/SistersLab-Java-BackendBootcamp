package Odev3;

import java.util.HashMap;
import java.util.Scanner;
//Soru3: Oyuncu Puanlari
//Bir oyuncu puan sistemini simule eden bir program yazin.
//Oyuncularin isimlerini anahtar, puanlarini deger olarak kullanarak bir HashMap icinde saklayin.
//Oyunculara puan eklemek ve puanlarini goruntulemek gibi islemleri gerceklestiren bir program yazin.
public class soru3 {

    private static void puanEkle(Scanner scanner, HashMap<String, Integer> oyuncuPuanlari) {
        System.out.print("Oyuncu adını girin: ");
        String oyuncuAdi = scanner.nextLine();

        System.out.print("Eklemek istediğiniz puanı girin: ");
        int eklenenPuan = scanner.nextInt();
        scanner.nextLine();

        int mevcutPuan = oyuncuPuanlari.getOrDefault(oyuncuAdi, 0);

        oyuncuPuanlari.put(oyuncuAdi, mevcutPuan + eklenenPuan);
        System.out.println(oyuncuAdi + " oyuncusuna " + eklenenPuan + " puan eklendi.");
    }

    private static void puanlariGoruntule(HashMap<String, Integer> oyuncuPuanlari) {
        System.out.println("Oyuncu Puanları:");
        for (String oyuncuAdi : oyuncuPuanlari.keySet()) {
            int puan = oyuncuPuanlari.get(oyuncuAdi);
            System.out.println(oyuncuAdi + ": " + puan + " puan");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> oyuncuPuanlari = new HashMap<>();

        while (true) {
            System.out.println("1 - Puan Ekle");
            System.out.println("2 - Puanları Görüntüle");
            System.out.println("3 - Çıkış");
            System.out.print("Seçiminizi yapın: ");

            int secim = scanner.nextInt();
            scanner.nextLine();

            switch (secim) {
                case 1:
                    puanEkle(scanner, oyuncuPuanlari);
                    break;
                case 2:
                    puanlariGoruntule(oyuncuPuanlari);
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

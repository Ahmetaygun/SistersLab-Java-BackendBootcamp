package Odev3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//Soru4: Satis Takibi
//Bir sirketin satislarini takip eden bir program yazin. Her musterinin adini anahtar,
//satis miktarini deger olarak iceren bir HashMap kullanin.
//Toplam satis miktarini hesaplayarak en cok satis yapan musteriyi bulan bir program yazin.
public class soru4 {
    private static String findEnCokSatisYapanMusteri(HashMap<String, Double> satislar) {
        double enCokSatis = Double.MIN_VALUE;
        String enCokSatisYapanMusteri = null;

        for (Map.Entry<String, Double> entry : satislar.entrySet()) {
            if (entry.getValue() > enCokSatis) {
                enCokSatis = entry.getValue();
                enCokSatisYapanMusteri = entry.getKey();
            }
        }

        return enCokSatisYapanMusteri;
    }
    private static double calculateToplamSatisMiktari(HashMap<String, Double> satislar) {
        double toplamSatis = 0;

        for (double satisMiktari : satislar.values()) {
            toplamSatis += satisMiktari;
        }

        return toplamSatis;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Double> satislar = new HashMap<>();

        System.out.print("Kaç müşteri gireceksiniz? ");
        int musteriSayisi = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < musteriSayisi; i++) {
            System.out.print("Müşteri adını girin: ");
            String musteriAdi = scanner.nextLine();

            System.out.print("Satış miktarını girin: ");
            double satisMiktari = scanner.nextDouble();
            scanner.nextLine();
            satislar.put(musteriAdi, satisMiktari);
        }
        String enCokSatisYapanMusteri = findEnCokSatisYapanMusteri(satislar);

        double toplamSatisMiktari = calculateToplamSatisMiktari(satislar);
        System.out.println("Toplam Satış Miktarı: " + toplamSatisMiktari);
        System.out.println("En Çok Satış Yapan Müşteri: " + enCokSatisYapanMusteri);
    }
}


package Odev3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
//Soru2: Cift Sayilari Filtreleme
//Bir ArrayList icinde rastgele sayilari saklayin. Cift sayilari bir HashSet icine ekleyip,
//tek sayilari bir ArrayList icine ekleyen bir program yazin.
public class soru2 {

    public static void main(String[] args) {
        ArrayList<Integer> sayiListesi = new ArrayList<>();
        HashSet<Integer> ciftSayilar = new HashSet<>();
        ArrayList<Integer> tekSayilar = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int rastgeleSayi = random.nextInt(100);
            sayiListesi.add(rastgeleSayi);
        }
        for (int sayi : sayiListesi) {
            if (sayi % 2 == 0) {
                ciftSayilar.add(sayi);
            } else {
                tekSayilar.add(sayi);
            }
        }
        System.out.println("Rastgele Sayılar: " + sayiListesi);
        System.out.println("Çift Sayılar: " + ciftSayilar);
        System.out.println("Tek Sayılar: " + tekSayilar);
    }
}

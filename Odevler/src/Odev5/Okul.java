package Odev4;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Okul {
    private List<Ogrenci> ogrenciler;
    private List<Ogretmen> ogretmenler;

    public Okul() {
        ogrenciler = new ArrayList<>();
        ogretmenler = new ArrayList<>();
    }

    public void ogrenciEkle(Ogrenci ogrenci) {
        ogrenciler.add(ogrenci);
        System.out.println(ogrenci.getAd() + " " + ogrenci.getSoyad() + " öğrencisi eklendi.");
    }

    public void ogretmenEkle(Ogretmen ogretmen) {
        ogretmenler.add(ogretmen);
        System.out.println(ogretmen.getAd() + " " + ogretmen.getSoyad() + " öğretmeni eklendi.");
    }

    public void ogrenciListele() {
        if (ogrenciler.isEmpty()) {
            System.out.println("Öğrenci bulunmamaktadır.");
        } else {
            System.out.println("Öğrenciler:");
            for (Ogrenci ogrenci : ogrenciler) {
                System.out.println("Adı: " + ogrenci.getAd() + ", Soyadı: " + ogrenci.getSoyad() + ", Öğrenci No: " + ogrenci.getOgrenciNo());
            }
        }
    }

    public void ogretmenListele() {
        if (ogretmenler.isEmpty()) {
            System.out.println("Öğretmen bulunmamaktadır.");
        } else {
            System.out.println("Öğretmenler:");
            for (Ogretmen ogretmen : ogretmenler) {
                System.out.println("Adı: " + ogretmen.getAd() + ", Soyadı: " + ogretmen.getSoyad() + ", Branşı: " + ogretmen.getBrans());
            }
        }
    }
}
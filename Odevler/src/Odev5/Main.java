package Odev4;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Okul okul = new Okul();

        while (true) {
            System.out.println("1 - Öğrenci Ekle");
            System.out.println("2 - Öğretmen Ekle");
            System.out.println("3 - Öğrenci Listele");
            System.out.println("4 - Öğretmen Listele");
            System.out.println("5 - Çıkış");
            System.out.print("Seçiminiz: ");

            int secim = scanner.nextInt();
            scanner.nextLine(); // Dummy nextLine to clear buffer

            switch (secim) {
                case 1:
                    System.out.print("Öğrenci adı: ");
                    String ad = scanner.nextLine();
                    System.out.print("Öğrenci soyadı: ");
                    String soyad = scanner.nextLine();
                    System.out.print("Öğrenci numarası: ");
                    int ogrenciNo = scanner.nextInt();
                    Ogrenci ogrenci = new Ogrenci(ad, soyad, ogrenciNo);
                    okul.ogrenciEkle(ogrenci);
                    break;
                case 2:
                    System.out.print("Öğretmen adı: ");
                    String adOgretmen = scanner.nextLine();
                    System.out.print("Öğretmen soyadı: ");
                    String soyadOgretmen = scanner.nextLine();
                    System.out.print("Öğretmenin branşı: ");
                    String brans = scanner.nextLine();
                    Ogretmen ogretmen = new Ogretmen(adOgretmen, soyadOgretmen, brans);
                    okul.ogretmenEkle(ogretmen);
                    break;
                case 3:
                    okul.ogrenciListele();
                    break;
                case 4:
                    okul.ogretmenListele();
                    break;
                case 5:
                    System.out.println("Programdan çıkılıyor...");
                    System.exit(0);
                default:
                    System.out.println("Geçersiz seçim.");
            }
        }
    }
}
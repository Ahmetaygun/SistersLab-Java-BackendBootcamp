import java.util.Scanner;

//TekCiftKontrol
/*
 Soru5:
 if kullan
 Kullanicidan bir sayi girmesini isteyen ve girilen sayinin tek mi yoksa cift mi oldugunu belirleyen bir Java programini yazin.
 */
public class soru5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        if (sayi % 2 == 0) {
            System.out.println(sayi + " bir çift sayıdır.");
        } else {
            System.out.println(sayi + " bir tek sayıdır.");
        }

    }
}

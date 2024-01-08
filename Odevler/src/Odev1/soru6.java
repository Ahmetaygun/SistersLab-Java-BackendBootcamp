import java.util.Scanner;

//SayiSiralama
/*
 Soru6:
 if kullan
 Girilen 3 sayiyi "kucukten buyuge" siralayan programi yaziniz.
 */
public class soru6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Üç adet sayı girin:");

        System.out.print("1. Sayıyı girin: ");
        int sayi1 = scanner.nextInt();

        System.out.print("2. Sayıyı girin: ");
        int sayi2 = scanner.nextInt();

        System.out.print("3. Sayıyı girin: ");
        int sayi3 = scanner.nextInt();

        if (sayi1 <= sayi2 && sayi1 <= sayi3) {
            if (sayi2 <= sayi3) {
                System.out.println("Sıralama: " + sayi1 + " " + sayi2 + " " + sayi3);
            } else {
                System.out.println("Sıralama: " + sayi1 + " " + sayi3 + " " + sayi2);
            }
        } else if (sayi2 <= sayi1 && sayi2 <= sayi3) {
            if (sayi1 <= sayi3) {
                System.out.println("Sıralama: " + sayi2 + " " + sayi1 + " " + sayi3);
            } else {
                System.out.println("Sıralama: " + sayi2 + " " + sayi3 + " " + sayi1);
            }
        } else {
            if (sayi1 <= sayi2) {
                System.out.println("Sıralama: " + sayi3 + " " + sayi1 + " " + sayi2);
            } else {
                System.out.println("Sıralama: " + sayi3 + " " + sayi2 + " " + sayi1);
            }
        }

    }
}

package Odev2;
import java.util.Scanner;
//Palindrom kontrolü yapan metod

public class soru2 {
    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reverse = 0;

        while (number > 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }

        return originalNumber == reverse;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Palindrom kontrolü yapmak için bir sayı girin: ");
        int number = scanner.nextInt();

        if (isPalindrome(number)) {
            System.out.println(number + " bir palindrom sayıdır.");
        } else {
            System.out.println(number + " bir palindrom sayı değildir.");
        }
    }
}



package Odev2;
import java.util.Scanner;
//Fibonacci sayılarını özyinelemeli (recursive) olarak bulan program

public class soru1 {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Fibonacci sayısı için bir sınır belirtin: ");
        int n = scanner.nextInt();

        System.out.println("Fibonacci serisi:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}

// array 
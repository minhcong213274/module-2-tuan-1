package cong;
import java.util.Scanner;

public class Main {
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many primes do you want to print? ");
        int n = scanner.nextInt();
        for (int i = 0,j = 0; j <n ; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                j++;
            }
        }
    }

}
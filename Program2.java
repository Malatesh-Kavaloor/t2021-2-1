package screeningtest;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of 'x': ");
        int x = scanner.nextInt();

        System.out.print("Output: ");
        for (int i = 1; i <= x; i++) {
            System.out.print(2 * i - 1);
            if (i != x) {
                System.out.print(", ");
            }
        }

        scanner.close();
    }
}


package Compilation.others;

import java.util.Scanner;

public class LargestToSmallest {

    public static void exeLargeToSmall(Scanner scann) {
        LargestToSmallest app = new LargestToSmallest();
        app.findLargest();
    }

    public void findLargest() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 3 Numbers: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        int largest = calculateLargest(x, y, z);

        System.out.println("The largest number is: " + largest);
        scanner.close();
    }

    public int calculateLargest(int x, int y, int z) {
        int largest = x;

        if (y > largest) {
            largest = y;
        }

        if (z > largest) {
            largest = z;
        }

        return largest;
    }
}

import java.util.Scanner;

public class CakeGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count1 = 0;
        int count2 = 0;

        System.out.println("EDITED: 2.0 Input either 1 or 2 that decides which player will eat the cake");

        for (int i = 0; i < 5; i++) {
            int flip = scanner.nextInt();
            if (flip == 1) {
                count1 += 1;
            } else {
                count2 += 1;
            }
        }

        if (count1 > count2) {
            System.out.println("Player1 eats the cake.");
        } else {
            System.out.println("Player2 eats the cake.");
        }

        scanner.close();
    }
}
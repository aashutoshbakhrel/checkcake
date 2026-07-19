import java.util.Scanner;

public class CakeGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count1 = 0;
        int count2 = 0;

        System.out.println("EDITED: 3.0");
        System.out.println("Enter either 1 or 2 (5 valid inputs required):");

        int validInputs = 0;

        while (validInputs < 5) {
            int flip = scanner.nextInt();

            if (flip == 1) {
                count1++;
                validInputs++;
            } else if (flip == 2) {
                count2++;
                validInputs++;
            } else {
                System.out.println("Invalid input! Please enter only 1 or 2.");
            }
        }

        if (count1 > count2) {
            System.out.println("Player1 eats the cake.");
        } else if (count2 > count1) {
            System.out.println("Player2 eats the cake.");
        } else {
            System.out.println("It's a tie! Nobody eats the cake.");
        }

        scanner.close();
    }
}
package app;

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            showMenu();
            System.out.print("Choose an option: ");
            choice = readInt();

            switch (choice) {
                case 1:
                    System.out.println("Option 1: Input data");
                    pause();
                    break;

                case 2:
                    System.out.println("Option 2: Calculate sum");
                    pause();
                    break;

                case 3:
                    System.out.println("Option 3: Find maximum value");
                    pause();
                    break;

                case 4:
                    System.out.println("Option 4: Display list");
                    pause();
                    break;

                case 5:
                    System.out.println("Option 5: Save data to JSON / XML");
                    pause();
                    break;

                case 0:
                    System.out.println("Exit program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice!");
                    pause();
            }
        } while (choice != 0);
    }

    private static void showMenu() {
        System.out.println("==============================");
        System.out.println("1. Input data");
        System.out.println("2. Calculate sum");
        System.out.println("3. Find maximum value");
        System.out.println("4. Display list");
        System.out.println("5. Save data to JSON / XML");
        System.out.println("0. Exit");
        System.out.println("==============================");
    }

    private static int readInt() {
        while (!scanner.hasNextInt()) {
            System.out.print("Please enter an integer: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    private static void pause() {
        System.out.println("\nPress Enter to continue...");
        scanner.nextLine();
        scanner.nextLine();
    }
}

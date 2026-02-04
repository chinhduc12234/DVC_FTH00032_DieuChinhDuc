package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    private static final List<Integer> dataList = new ArrayList<>();

    public static void main(String[] args) {
        int choice;

        do {
            showMenu();
            System.out.print("Choose an option: ");
            choice = readInt();

            switch (choice) {
                case 1:
                    inputData();
                    pause();
                    break;

                case 2:
                    calculateSum();
                    pause();
                    break;

                case 3:
                    findMaxValue();
                    pause();
                    break;

                case 4:
                    displayList();
                    pause();
                    break;

                case 5:
                    System.out.println("Option 5: Save data to JSON / XML (not implemented)");
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

    // FUNCTION 1: INPUT DATA
    private static void inputData() {
        System.out.println("Enter integers (type 'q' to stop):");

        while (true) {
            System.out.print("Input value: ");
            String input = scanner.next();

            if (input.equalsIgnoreCase("q")) {
                break;
            }

            try {
                int value = Integer.parseInt(input);
                dataList.add(value);
                System.out.println("Added: " + value);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter an integer.");
            }
        }

        System.out.println("Total elements in list: " + dataList.size());
    }


    // FUNCTION 2: CALCULATE SUM
    private static void calculateSum() {
        if (dataList.isEmpty()) {
            System.out.println("The list is empty. Please input data first.");
            return;
        }

        int sum = 0;
        for (int value : dataList) {
            sum += value;
        }

        System.out.println("Sum of elements: " + sum);
    }

    // FUNCTION 3: FIND MAX VALUE
    private static void findMaxValue() {
        if (dataList.isEmpty()) {
            System.out.println("The list is empty. Please input data first.");
            return;
        }

        int max = dataList.get(0);
        for (int value : dataList) {
            if (value > max) {
                max = value;
            }
        }

        System.out.println("Maximum value in the list: " + max);
    }

    // FUNCTION 4: DISPLAY LIST
    private static void displayList() {
        if (dataList.isEmpty()) {
            System.out.println("The list is empty. Please input data first.");
            return;
        }

        System.out.println("Current values in the list:");
        for (int i = 0; i < dataList.size(); i++) {
            System.out.println("Index " + i + ": " + dataList.get(i));
        }
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

package ArrayList;

import java.util.Scanner;

import java.util.ArrayList;

public class even {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an ArrayList to store the numbers
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        // Input numbers from the user
        System.out.println("Enter numbers (enter -1 to stop):");
        int input;
        while (true) {
            input = scanner.nextInt();
            if (input == -1) {
                break;
            }
            numbers.add(input);
        }

        // Remove even numbers from the ArrayList
        removeEvenNumbers(numbers);

        // Print the updated ArrayList
        System.out.println("Updated ArrayList after removing even numbers: " + numbers);
    }

    public static void removeEvenNumbers(ArrayList<Integer> list) {
        // Iterate through the ArrayList and remove even numbers
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
            }
        }
    }
}

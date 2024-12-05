package Hash;

import java.util.Scanner;

public class charHash {

    public static void main(String[] args) {

        // Initialize the array with some values between 0 and 9
        String ch = "ajgduabfoba"; // Example values
        int[] hash = new int[26]; // Frequency array

        for (int i = 0; i < ch.length(); i++) {

            hash[ch.charAt(i) - 'a'] += 1;
        }

        Scanner sc = new Scanner(System.in);

        // Prompt user for input
        System.out.println("Enter a number between 0 and 9:");
        String i = sc.nextLine();

        char c = i.charAt(0);

        System.out.println("Frequency of " + i + " is " + hash[c   - 'a']);

    }


}

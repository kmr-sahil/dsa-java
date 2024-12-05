package Hash;

import java.util.Scanner;

public class arryaHash {
    
    public static void main(String[] args) {

        // Initialize the array with some values between 0 and 9
        int[] arr = {1, 2, 2, 2, 5}; // Example values
        int[] hash = new int[10]; // Frequency array

        for(int i = 0; i<arr.length; i++){
            
            hash[arr[i]] += 1;
        }

        Scanner sc = new Scanner(System.in);
        
        // Prompt user for input
        System.out.println("Enter a number between 0 and 9:");
        int i = sc.nextInt();

        System.out.println("Frequency of " + i + " is " + hash[i]);

        
    }
}

package Arrays;

import java.util.Scanner;

public class subarray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);  
        int arr[] = new int[4];
        int n= arr.length;

        for(int i=0; i<n; i++){
            arr[i] = in.nextInt() ;
        }

        System.out.println("Here is the inputted array");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + "  ");
        }

        System.out.println("Here is the list of subarray");
        for(int si=0; si<n; si++){
            for(int ei=si; ei<n; ei++){

                for(int i = si; i<= ei; i++){
                    System.out.print(arr[i] + "  ");
                }
                System.out.println("");
            }
        }
    }
}

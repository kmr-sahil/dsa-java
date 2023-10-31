//reverse a 1d array

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);  
        int arr[] = new int[10];

        for(int i=0; i<10; i++){
            arr[i] = in.nextInt() ;
        }

        System.out.println("Here is the inputted array");
        for(int i=0; i<10; i++){
            System.out.print(arr[i] + "  ");
        }

        int i = 0;
        int j = 10-1;

        while(i<j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        System.out.println("Here is the reversed array");
        for(int a=0; a<10; a++){
            System.out.print(arr[a] + "  ");
        }
    }
}

package Arrays;

import java.util.Scanner;

public class transpose {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);  
        System.out.println("Enter no. of rows & cols");
          int n = in.nextInt();
          int [][] arr = new int[n][n];

          for (int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = in.nextInt();
            }
          }

          System.out.println("The matrix");

          for (int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println("");
          }

          for (int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                
                if(i>j){
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }
          }

          System.out.println("Tranposed matrix");
          for (int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println("");
          }
    }
}

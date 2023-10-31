import java.util.*;  
public class max {  
public static void main(String args[]){  
          Scanner in = new Scanner(System.in);  
          int [][] arr = new int[3][3];
          for (int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                arr[i][j] = in.nextInt();
            }
          }

          for (int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println("");
          }

          int max = 0;

          for (int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
          }

          System.out.println("The max num is ---> " + max);
                  
          }  
}  
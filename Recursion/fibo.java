package Recursion;

public class fibo {

    public int[] recurFibo(int n, int arr[]){

        if (n <= 1) {
            arr[0] = 0;
            if (n == 1) {
                arr[1] = 1;
            }
            return arr;
        }

        recurFibo(n - 1, arr);
        arr[n] = arr[n - 1] + arr[n - 2];
        return arr;

    }

    public static int fibonacci(int N){
        if(N <= 1){
                
            return N;
        }
        
        // Problem broken down into 2 functional calls
        // and their results combined and returned.
        int last = fibonacci(N-1);
        int slast = fibonacci(N-2);
        
        return last + slast;
    }
    
    public static void main(String[] args) {

        // fibo obj = new fibo();
        // int n = 6; // Change this to the desired number of Fibonacci numbers
        // int[] arr = new int[n+1];
        
        // obj.recurFibo(n, arr);
        
        // Print the array
        System.out.println("Fibonacci Sequence:" + fibonacci(4));
        // for (int i = 0; i < n; i++) {
        //     System.out.print(arr[i] + " ");
        // }
        
    }

}

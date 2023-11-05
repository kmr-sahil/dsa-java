package Recursion;

public class printArray {
    public static void main(String[] args) {
        int arr[] = {12, 8, 13, 50, 7, 2, 17};
        print(arr.length-1, arr);
    }

    public static void print(int N, int arr[]){

        if(N == -1){
            return;
        }

        print(N-1, arr);
        System.out.println(arr[N]);
    }
}

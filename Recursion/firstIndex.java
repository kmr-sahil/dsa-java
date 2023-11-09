package Recursion;

public class firstIndex {
    public static void main(String[] args) {
        int arr[] = {12, 8, 13, 50, 7, 2, 17};
        int n = 30;
        findIndex(0, arr, n);
    }

    public static void findIndex(int i, int arr[] , int N){

        if(arr[i] == N || i == arr.length-1){
            System.out.println("found the index : " + N + " at " + i);
            return;
        }

        findIndex(i+1, arr, N);
        System.out.println(arr[i]);
    }
}

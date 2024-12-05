package Recursion;

public class reverseArray {

    public static int[] simpleRev(int arr[]){ // normal technique

        int i = 0;
        int j = arr.length-1;

        while(i<arr.length/2){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            System.out.println(arr[i] + " swap " + arr[j]);

            i++;
            j--;
        }

        return arr;
    }

    public static int[] recurRev(int arr[], int i, int j){
        if(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            recurRev(arr, i+1, j-1);
        }

        return arr;
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        recurRev(arr, 0, arr.length-1);
        
        // print array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

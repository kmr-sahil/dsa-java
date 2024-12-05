package Recursion;

public class insertionsor {

    public static void insert(int arr[], int n, int i){

        if(i == n){
            return;
        }

        //for(int i=n;i<arr.length; i++){
            //i = n-arr.length;
            int key = arr[i];
            int j = i-1;

            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = key;

            insert(arr,n,i+1);
        //}
    }
    public static void main(String[] args) {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};

        insert(arr,arr.length,1);

        System.out.println("Sorted array:");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

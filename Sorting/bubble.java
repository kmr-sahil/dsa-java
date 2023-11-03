package Sorting;

public class bubble {
    public static void main(String[] args) {
        int arr[] = {6, 9, 2, 8, -1, 5};

        for(int i=0; i< arr.length-1; i++) {
            for(int j = 0;j< arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
            }
            }
            
        }

        for(int val: arr) {
            System.out.println(val);
           }
    }
}

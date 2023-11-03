package Sorting;

public class insertion {
    public static void main(String[] args) {
        
        int arr[] = {6, 9, 2, 8, -1, 5};

        for(int i = 1; i<arr.length; i++){
            int key = arr[i];

            int j = i - 1;
            while(j>=0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = key;
        }

        for(int val: arr) {
            System.out.println(val);
           }

    }
}

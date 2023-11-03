package Sorting;

public class selection {
    public static void main(String[] args) {
        int arr[] = {6, 9, 2, 8, -1, 5};

        for(int i=0; i< arr.length-1; i++) {
            int minval = arr[i];
            int mindx = i;

            for(int j=i+1; j< arr.length; j++) {
                if(arr[j] < minval) {
                    minval = arr[j];
                    mindx = j;
                }
            }

            int temp = arr[i];
                arr[i] = arr[mindx];
                arr[mindx] = temp;
        }

        for(int val: arr) {
            System.out.println(val);
           }
    }
}

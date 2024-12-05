package Arrays;

import java.util.ArrayList;

public class unions {

    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        // add your code here
        ArrayList <Integer> arr = new ArrayList<Integer>();
        
        int i = 0;
        int j = 0;
        
        while(i < n){
            if(arr1[i] <= arr2[j]){
                if (!arr.contains(arr1[i])) {
                    arr.add(arr1[i]);
                }
                i++;
            } else {
                if (!arr.contains(arr2[j])) {
                    arr.add(arr2[j]);
                }
                j++;
            }
        }
        
        while(j < m){
            if (!arr.contains(arr2[j])) {
                arr.add(arr2[j]);
            }
            j++;
        }

        while(i < n){
            if (!arr.contains(arr1[i])) {
                arr.add(arr1[i]);
            }
            i++;
        }
        
        return arr;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 5, 6};
        int[] arr2 = {2, 3, 5, 7};

        ArrayList<Integer> unionResult = findUnion(arr1, arr2, arr1.length, arr2.length);

        System.out.println("Union of the two arrays is: " + unionResult);
    }
}

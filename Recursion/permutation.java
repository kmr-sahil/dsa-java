package Recursion;

import java.util.Arrays;

public class permutation {

    public static void permu(int arr[], int l, int h) {
        if () {
            System.out.println(Arrays.toString(arr));
        }

        for (int i = l; i <= h; i++) {

            int temp = arr[l];
            arr[l] = arr[i];
            arr[i] = temp;

            permu(arr, l + 1, h);

            temp = arr[l];
            arr[l] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3};

        permu(arr, 0, 2);

    }
}

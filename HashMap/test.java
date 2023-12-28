//intersection

import java.util.HashMap;

public class test {

    public static void main(String[] args) {
        
        int arr1[] = {1, 1, 2, 2, 2, 3, 5};
        int arr2[] = {1, 1, 1, 2, 2, 4, 5};

        intersect(arr1, arr2);
    }

    public static void intersect(int a[], int b[]){

        HashMap<Integer, Integer> bmap = new HashMap<>();

        for(int i=0; i<b.length;i++){
            if(bmap.containsKey(b[i])){
                int temp = bmap.get(b[i]);
                bmap.put(b[i], temp+1);
            } else{
                bmap.put(b[i], 1);
            }
        }
        
        for(int i=0; i<a.length; i++){
            
            if(bmap.containsKey(a[i]) && bmap.get(a[i]) > 0){
                int temp = bmap.get(a[i]);
                bmap.put(a[i], temp-1);
                System.out.println(a[i]);

            }
            
        }
    }
}
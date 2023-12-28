import java.util.HashMap;

public class common {
    
    public static void main(String[] args) {
        
        int ar1[] = {5,9,7,6,3,4,2,1};
        int ar2[] = {2,10,14,8,6,0,7};

        HashMap<Integer, Integer> num = new HashMap<>();

        for(int i=0; i<ar1.length; i++){
            num.put(ar1[i], 1);
        }

        
        for(int i=0; i<ar2.length; i++){
            if(num.containsKey(ar2[i])){
                System.out.println(ar2[i]);
            }
        }

        }
}

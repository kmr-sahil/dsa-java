package Recursion;

import java.util.ArrayList;

public class facrRecur {
    public static ArrayList<Long> fac(int n, ArrayList<Long> list){

        if(n == 0){
            return list;
        }

        long factorial = 1;
        long i = 1;
        
        while (i <= n) {
            factorial *= i;
            i++;
        }

        list.add(factorial);

        fac(--n, list);

        return list;

    }

    public static void main(String args[]){
        ArrayList<Long> ans = new ArrayList<Long>();
        fac(5, ans);

        for(int i = 0; i < ans.size(); i++) {   
            System.out.println(ans.get(i));
        } 
    }
}

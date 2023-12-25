package Recursion;

public class factorial {
    public static void main(String[] args) {

        int total = 1;
        factoria(4, total);
    }

    public static void factoria(int N, int total) {
        if(N == 0){
            System.out.println(total);
            return;
        }
        
        total = total * N;
        factoria(N-1, total);
    }
}

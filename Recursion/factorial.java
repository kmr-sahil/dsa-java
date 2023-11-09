package Recursion;

public class factorial {
    public static void main(String[] args) {

        int total = 1;
        factorial(4, total);
    }

    public static void factorial(int N, int total) {
        if(N == 0){
            System.out.println(total);
            return;
        }
        
        total = total * N;
        factorial(N-1, total);
    }
}

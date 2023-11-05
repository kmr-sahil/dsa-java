package Recursion;

public class printtillN {
    public static void main(String[] args) {
        print(12);
    }

    public static void print(int N){
        if(N == 0){
            return;
        }

        print(N-1);
        System.out.println(N);
    }
}

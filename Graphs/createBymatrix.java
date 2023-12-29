import java.util.Scanner;

public class createBymatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();

        int [][] graph = new int[n+1][n+1];

        for(int i=0; i<m+1; i++){

            int v=sc.nextInt();
            int u=sc.nextInt();

            graph[v][u] = 1;
            graph[u][v] = 1;
        }

    }
}
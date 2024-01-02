import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class createBylist {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        List<List<Integer>> graph = new ArrayList<>();

        for(int i=0; i<n+1 ; i++){
            graph.add(new ArrayList<>());
        }

        for(int i=0; i<m+1; i++){

            int v=sc.nextInt();
            int u=sc.nextInt();

            graph.get(u).add(v);
            graph.get(v).add(u);
        }
    }
}

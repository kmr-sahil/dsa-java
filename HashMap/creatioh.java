import java.util.HashMap;

public class creatioh {
    
    public static void main(String[] args) {
        
        HashMap<String, Integer> population = new HashMap<>();

        population.put("India", 33);
        population.put("Croatia", 12);
        population.put("Nike", 50);

        System.out.println(population.get("Nike"));

        System.out.println(population.containsKey("HimLya"));
        System.out.println(population.containsKey("India"));

        population.remove("Croatia");


        for(String s: population.keySet()){
            System.out.println(s);
        }
    }
}

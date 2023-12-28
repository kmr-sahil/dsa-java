import java.util.HashSet;

public class firstrepeatingchar {
    
    public static void main(String[] args) {
        
        String st = "csedsnhg";
        HashSet<Character> set = new HashSet<>();

        for(int i=0; i<st.length(); i++){

            char ch = st.charAt(i);

            if(set.contains(ch)){
                System.out.println(ch);
                return;
            } else {
                set.add(ch);
            }

            
        }
    }
}

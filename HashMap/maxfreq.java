import java.util.HashMap;

public class maxfreq {
    public static void main(String[] args) {
        
        HashMap<Character, Integer> fmap = new HashMap<>();

        String st = "aabcccdabcd";

        for(int i=0; i<st.length();i++){
            char ch = st.charAt(i);

            if(fmap.containsKey(ch) == true){
                int cfreq = fmap.get(ch);
                fmap.put(ch, cfreq+1);
            } else {
                fmap.put(ch, 1);
            }
        }

        int maxval = 0;
        char maxchar = 'a';

        for(Character c: fmap.keySet()){
            if(fmap.get(c)>maxval){
                maxval = fmap.get(c);
                maxchar = c;
            }
        }

        System.out.println(maxchar);

    }
}

// skip the consecutive n words if same

package Strings;

public class skip {

    public static void main(String[] args) {
        String A = "aaafcccoovvvl";
        int B = 3;
        System.out.println(solve(A, B));
    }

        public static String solve(String A, int B) {
            int i = 0;
            String ans = "";
            while(i < (A.length()) ){
    
                char currentChar = A.charAt(i);
                
                int c = 0;
                int j = i;
                while (j < A.length() && A.charAt(j) == currentChar){
                    c++;
                    j++;
                }

                if(c == B){
                    i += B;
                } else {
                    ans += A.charAt(i);
                    i++;
                }
    
             
            }
    
            return ans;
        }
    }
    


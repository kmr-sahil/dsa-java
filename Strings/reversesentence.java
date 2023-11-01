// reverse the words

package Strings;

public class reversesentence {
    public static void main(String[] args) {
        String A = "the sky is blue";
        System.out.println(solve(A));;
    }

    
        public static String solve(String A) {
            String ans = "";
            int j = A.length() - 1;
            for(int  i=A.length()-1; i>=0; i--){
                
                char ch = A.charAt(i);
                if(ch == ' ' || i == 0){
                    String temp = A.substring(i, j+1);
                    ans += temp;
                    j=i;
                }
    
            }
    
            return ans;
        }
    }
    


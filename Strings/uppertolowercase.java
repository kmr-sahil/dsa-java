package Strings;

public class uppertolowercase {
    public static void main(String[] args) {
        String st = "WelcOmeToScAleR.";
        uptolow(st);
    }

    public static void uptolow(String st) {
        char s[] = st.toCharArray();

        for(int i = 0; i<s.length; i++){
            if(s[i] >= 'A' && s[i] <= 'Z'){
                char ans = (char)(s[i] - 'A' + 'a');
                s[i] = ans;
            }
        }

        System.out.print(s);
    }
}

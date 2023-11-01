package Strings;

public class reversevowels {
    public static void main(String[] args) {
        String st = "youcandoit";
        String reversed = reverse(st);
        System.out.println(reversed);
    }

    public static String reverse(String st) {
        char[] s = st.toCharArray();
        int i = 0;
        int j = s.length - 1;

        while (i < j) {
            while (i < j && !isVowel(s[i])) {
                i++;
            }
            while (i < j && !isVowel(s[j])) {
                j--;
            }

            char ch = s[i];
            s[i] = s[j];
            s[j] = ch;
            i++;
            j--;
        }

        return new String(s);
    }

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}

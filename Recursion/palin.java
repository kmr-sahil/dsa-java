package Recursion;

public class palin {

    public static boolean checkPalin(String str) {
        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            char sti = str.charAt(i);
            char stj = str.charAt(j);

            if (sti != stj) {
                return false;
            }

            i++;
            j--;

        }

        return true;
    }

    public static String recurPalin(String str, int i, int j) {

        if (i >= j) {
            return str;
        }
        
        char[] chars = str.toCharArray();
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
        
        String newStr = new String(chars);
        return recurPalin(newStr, i + 1, j - 1);
    }

    public static void main(String[] args) {
        String str = "ABCNMFGH";
        System.out.println(recurPalin(str, 0, 7));
    }
}

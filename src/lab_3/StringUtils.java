package lab_3;

public class StringUtils {

    public static boolean isEmpty(String s) {
        return s == null || s.length() == 0;
    }

    public static String capitalise(String s) {
        if (isEmpty(s)) {
            return s;
        } else {
            return Character.toUpperCase(s.charAt(0)) + s.substring(1);
        }
    }

    public static String repeat(String s, int times) {
        if (s == null) return "";
        String result = "";
        for (int i = 0; i < times; i++) {
            result = result + s;
        }
        return result;
    }

    public static int countChar(String s, char c) {
        if (s == null) return 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(isEmpty(""));
        System.out.println(capitalise("omar"));
        System.out.println(repeat("7 ", 3));
        System.out.println(countChar("programming", 'm'));
    }


}
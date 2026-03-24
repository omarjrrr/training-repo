public class stringExplorer {
    public static void main(String[] args) {
        String name = "Omar Mohamed";

        System.out.println(name.length());
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(name.length() - 1));
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        String reversed = new StringBuilder(name).reverse().toString();
        System.out.println(reversed);
        System.out.println(name.contains(" "));


    }
}

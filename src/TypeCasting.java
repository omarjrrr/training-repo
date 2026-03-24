public class TypeCasting {
    public static void main(String[] args) {
        double price = 29.99;
        int newprice = (int) price;

        System.out.println(price);
        System.out.println(newprice);

        System.out.println(7 / 2);
        System.out.println((double) 7 / 2);

        String num = "42";
        int n = Integer.parseInt(num);
        System.out.println(n);
    }
}

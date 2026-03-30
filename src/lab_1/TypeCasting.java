package lab_1;
public class TypeCasting {
    public static void main(String[] args) {
        double price = 29.99;
        int newPrice = (int) price;

        System.out.println(price);
        System.out.println(newPrice);

        System.out.println(7 / 2);
        System.out.println((double) 7 / 2);

        String num = "42";
        int n = Integer.parseInt(num);
        System.out.println(n);
    }
}

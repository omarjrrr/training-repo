package lab_2;
public class calc {
    public static void main(String[] args) {

        int score = 77;

        if (score >= 90)
            System.out.println("Grade A - Excellent!");
        else if (score >= 80)
            System.out.println("Grade B - Good");
        else if (score >= 70)
            System.out.println("Grade C");
        else if (score >= 60)
            System.out.println("Grade D - Needs improvement");
        else
            System.out.println("Grade F");
    }
}

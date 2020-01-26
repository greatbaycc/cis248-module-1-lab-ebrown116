import java.util.Scanner;

public class caffeine {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double caffeineMg;

        caffeineMg = scnr.nextDouble();

        caffeineMg = caffeineMg / 2;
        System.out.printf("After 6 hours: %.2f mg\n", caffeineMg);
        caffeineMg = caffeineMg / 2;
        System.out.printf("After 12 hours: %.2f mg\n", caffeineMg);
        caffeineMg = caffeineMg / 4;
        System.out.printf("After 24 hours: %.2f mg\n", caffeineMg);
    }
}

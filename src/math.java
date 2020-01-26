import java.util.Scanner;

public class math {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double x = scnr.nextDouble();
        double y = scnr.nextDouble();
        double z = scnr.nextDouble();

        System.out.print(Math.pow(x, z) + " ");
        System.out.print(Math.pow(x, Math.pow(y, z)) + " ");
        System.out.print(Math.abs(y) + " ");
        System.out.println(Math.sqrt(Math.pow(x*y,z)));
    }
}
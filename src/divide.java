import java.util.Scanner;

public class divide {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        int userNum = scnr.nextInt();
        int x = scnr.nextInt();

        System.out.println((userNum / x) + " " + ((userNum / x) / x) + " " + (((userNum / x) / x) / x));
    }
}
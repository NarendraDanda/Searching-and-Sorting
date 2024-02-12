import java.util.Scanner;

public class ModulusDivision {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = a%b; // gives reminder
        int d = a/b; // gives quotient
        System.out.println(c + " and " +d);
    }
}


//function gcd takes two integers and returns their gcd/hcf.
import java.util.*;

public class gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sc.close();
        if (num1 == 0 || num2 == 0) {
            System.out.println("values must be non zero");
            return;
        }

        int quo = num2;
        int div = num1;
        int rem = quo % div;

        while (rem != 0) {
            int value = div;
            div = rem;
            quo = value;
            rem = quo % div;
        }
        int gcd = div;
        System.out.println("GCD of " + num1 + " and " + num2 + " is " + gcd);
    }
}

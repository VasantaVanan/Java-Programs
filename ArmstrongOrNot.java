import java.util.*;
public class ArmstrongOrNot {
    public static void main(String args[]) {
        int temp, n, r = 0, d;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value");
        n = in.nextInt();
        temp = n;
        while (n > 0){
            d = n % 10;
            r += (d * d * d);
            n /= 10;
        }
        if (temp == r)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not armstrong number");
    }
}
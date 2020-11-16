import java.util.*;
public class PrimeOrNot {
    public static void main (String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = in.nextInt();
        System.out.println(prime(n));
    }

    public static boolean prime(int n) {
        if (n <= 1)
            return false;
        for(int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
        return true;
    }
}
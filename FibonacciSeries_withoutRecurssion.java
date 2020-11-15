import java.util.*;
public class FibonacciSeries_withoutRecurssion{
    public static void main(String args[]){
        int t1 = 0, t2 = 1, sum;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int n = in.nextInt();
        System.out.println("The fibonacci series is:");
        for(int i = 1; i <= n; i++) {
            System.out.print(t1 + " ");
            sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
}
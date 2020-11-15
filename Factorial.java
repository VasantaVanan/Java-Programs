import java.util.*;
public class Factorial{
    public static void main(String args[]) {
        int sum = 1;
        System.out.println("Enter the value");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while(n > 0){
            sum = sum * n;
            n--;
        }
        System.out.println("The factorial is " + sum);
    }
}
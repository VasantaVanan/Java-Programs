import java.util.*;
public class FibonacciSeries_recurssion {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int n = in.nextInt(); //Obtaining limit from user
        System.out.println("The Fibonacci series is");
        //Iterating through the elements of given limit
        for(int i = 0; i < n; i++) {
            System.out.print(Fibonacci(i) + " ");
        }
    }

    public static int Fibonacci(int n){
        if(n == 0)
            return 0;//Returning 0 for the 1st element
        else if (n == 1 || n == 2)
            return 1; //Returning 1 for the 2nd and 3rd element
        else
            return Fibonacci(n - 2) + Fibonacci(n - 1); //Recurrsion part
    }
}
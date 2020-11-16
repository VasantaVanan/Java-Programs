import java.util.*;
public class PalindromeOrNot {
    public static void main(String args[]) {
        int r, sum = 0, temp;
        System.out.println("Enter the element");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        temp = n;
        while(n > 0){
            r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if (temp == sum)
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
    }
}
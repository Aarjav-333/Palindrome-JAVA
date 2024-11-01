import java.util.Scanner;

public class Palindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int rem, rev = 0, ori;
        System.out.println("Enter a number");
        int num = sc.nextInt();
        ori = num;
        
        while (num > 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        
        if (ori == rev) {
            System.out.println(ori + " is a palindrome");
        } else {
            System.out.println(ori + " is not a palindrome");
        }
    }
}

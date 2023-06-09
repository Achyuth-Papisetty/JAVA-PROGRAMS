import java.util.Scanner;
public class GCDRecursive1 {
    public static void main(String[] args) 
    {
	Scanner achyuth = new Scanner(System.in);
	System.out.println("Enter first number : ");
        int num1 = achyuth.nextInt();
	System.out.println("Enter second number : ");
        int num2 = achyuth.nextInt();
        int gcd = findGCD(num1, num2);
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
    }

    public static int findGCD(int num1, int num2) 
    {
        if (num2 == 0) 
	{
            return num1;
        } 
	else 
	{
            return findGCD(num2, num1 % num2);
        }
    }
}

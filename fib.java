import java.util.Scanner;
public class fib {
public static void main(String[] args) {
Scanner ac=new Scanner(System.in);
System.out.println("Enter a number : ");
int n=ac.nextInt();
int a=0,b=1,c=0;
System.out.print("the "+n+" fibonacci series are : "+a+" "+b+" ");

for(int i=2;i<n;i++) {
c=a+b;
System.out.print(c+" ");
a=b;
b=c;
}
System.out.println(" ");
System.out.print(n+" th fibonacci number is  "+c);
}
}

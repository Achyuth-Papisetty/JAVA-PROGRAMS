import java.util.Scanner;
public class primeOrNot {
public static void main(String[] args) {
Scanner a=new Scanner(System.in);
int i,flag=2;
System.out.print("Enter a number : ");
int n=a.nextInt();
for(i=2;i<=n/2;i++)
{
if(n%i==0)         
{
System.out.println(n+" is not a prime number");
flag=1;
break;
}
}
if(flag==2)
{
System.out.println(n+" is a prime number");
}
}
}
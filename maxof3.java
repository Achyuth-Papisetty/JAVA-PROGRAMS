import java.util.Scanner;
public class maxof3 {
public static void main(String[] args) {
int p,q,r;
Scanner a=new Scanner(System.in);
System.out.println("Enter 1st number :");
p=a.nextInt();
System.out.println("Enter 2nd number : ");
q=a.nextInt();
System.out.println("Enter 3rd number : ");
r=a.nextInt();
if(p>q) 
{
 if(p>r) 
  {
   System.out.println(+p+" is greater");
  }
 else
 {
   System.out.println(+r+" is greater");
 }
}
else if(q>r)
 {
  System.out.println(+q+" is greater");
 }
 else
  {
   System.out.println(+r+" is greater");
  }
}
}

import java.util.Random;
public class random
{
public static void main(String[] args)
{
Random r=new Random();
int num=r.nextInt(10);
System.out.println("This code generates a random number between 0 and 10");
System.out.println(num);
}
}
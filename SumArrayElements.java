import java.util.Scanner; 
public class SumArrayElements 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
      
        System.out.print("Enter the size of the array: ");
        int n = input.nextInt();

        int[] arr = new int[n]; // create an empty array of size n

        // populate the array with values entered by the user
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("The sum of the array elements is: " + sum); 
    }
}

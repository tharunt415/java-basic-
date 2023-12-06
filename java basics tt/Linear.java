import java.util.Scanner;
public class Linear{
   public static void main(String[] args)
   {
      int i;
      Scanner s = new Scanner(System.in);
      System.out.print("Enter no of elements: ");
      int n=s.nextInt();
      int[] arr = new int[n];
      System.out.println("\nEnter elements: ");
      for(i=0; i<n; i++)
         arr[i] = s.nextInt();
      System.out.print("\nEnter element to search: ");
      int num = s.nextInt();
      for(i=0; i<n; i++)
      {
         if(num==arr[i])
         {
            System.out.println("\nThe element found at position: " +(i+1));
            break;
         }
      }
   }
}
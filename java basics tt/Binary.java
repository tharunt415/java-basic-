import java.util.Scanner;
public class Binary
{
   public static void main(String[] args)
   {
       Scanner s=new Scanner(System.in);
       System.out.print("Enter no of elements: ");
       int n=s.nextInt();
       int[] arr=new int[n];
       System.out.println("\nEnter elements: ");
       for(int i=0;i<n;i++){
           arr[i]=s.nextInt();
       }
       System.out.print("\nEnter element to search: ");
       int search = s.nextInt();
       int first = 0,last = n-1,middle = (first+last)/2;
       while(first<=last)
       {
           if(arr[middle]==search)
           {
               System.out.println("Element is found at " +(middle+1));
               break;
           }
           else if(arr[middle]<search)
           {
               first=middle+1;
           }
           else
           {
               last=middle-1;
           }
           middle=(first+last)/2;
       }
       if(first>last)
       {
           System.out.println("Element not found");
       }
   }
}
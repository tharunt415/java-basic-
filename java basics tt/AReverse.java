import java.io.*;
import java.util.Scanner;
public class AReverse{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("\nEnter array elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array elements in reverse order..");
        for(int i=n-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
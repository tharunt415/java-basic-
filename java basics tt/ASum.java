import java.io.*;
import java.util.Scanner;
public class ADuplicate{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("\nEnter array elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=o;i<n;i++){
            sum+=arr[i];
        }
        System.out.println("Sum of elements of array=> "+sum);
    }
}
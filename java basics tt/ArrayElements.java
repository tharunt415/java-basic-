import java.io.*;
import java.util.Scanner;
public class ArrayElements{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("\nEnter array elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("\nArray Elements are.. ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
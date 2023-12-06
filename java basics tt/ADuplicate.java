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
        System.out.println("\nDuplicate elements in the array..");
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
            if(arr[i]==arr[j]){
                System.out.print(arr[j]+" ");
            }
        }
        }
    }
}
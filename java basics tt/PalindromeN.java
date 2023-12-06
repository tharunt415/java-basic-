import java.io.*;
import java.util.Scanner;
class PalindromeN{
    public static void main(String[] args){
        System.out.println("Enter a number to check:");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int temp=n, rem, r=0;
        while(n>0){
            rem=n%10;
            n=n/10;
            r=(r*10)+rem;
        }
        if(temp==r){
            System.out.println("NUMBER IS PALINDROME");
        }
        else{
            System.out.println("NUMBER IS NOT PALINDROME");
        }
    }
}

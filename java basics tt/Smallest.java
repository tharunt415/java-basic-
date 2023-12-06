import java.io.*;
import java.util.Scanner;
public class Smallest{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st value..");
        int a=sc.nextInt();
        System.out.println("Enter 2nd value..");
        int b=sc.nextInt();
        System.out.println("Enter 3rd value..");
        int c=sc.nextInt();
        NSmall sob=new NSmall();
        sob.small(a,b,c);
    }
}
class NSmall{
    void small(int a, int b, int c){
        int x=(a<b)?a:b;
        int y=x<c?x:c;
        System.out.println("\nSmallest number=> "+y);
    }
}
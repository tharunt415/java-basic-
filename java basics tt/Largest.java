import java.io.*;
import java.util.Scanner;
public class Largest{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st value..");
        int a=sc.nextInt();
        System.out.println("Enter 2nd value..");
        int b=sc.nextInt();
        System.out.println("Enter 3rd value..");
        int c=sc.nextInt();
        MLarge lob=new MLarge();
        lob.large(a,b,c);
    }
}
class MLarge{
    void large(int a, int b, int c){
        if((a>b)&&(a>c))
            System.out.println("\n"+a+" is largest number");
        else if((b>a)&&(b>c))
            System.out.println("\n"+b+" is largest number");
        else
            System.out.println("\n"+c+" is largest number");
    }
}
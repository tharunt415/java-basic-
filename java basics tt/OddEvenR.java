import java.io.*;
import java.util.Scanner;
public class OddEvenR{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter initial value..");
        int a=sc.nextInt();        
        System.out.println("Enter final value..");
        int b=sc.nextInt();
        Odd oobj=new Odd();
        oobj.oddcheck(a,b);
        Even eobj=new Even();
        eobj.evencheck(a,b);
    }
}
class Odd{
        void oddcheck(int a, int b){
            System.out.println("\nOdd numbers between "+a+" to "+b+"..");
            for(int i=a;i<=b;i++){
                if((i%2)!=0)
                    System.out.print(i+" ");
            }
            System.out.println();
        }
}
class Even{
        void evencheck(int a, int b){
            System.out.println("\nEven numbers between "+a+" to "+b+"..");
            for(int i=a;i<=b;i++){
                if((i%2)==0)
                    System.out.print(i+" ");
            }
        }
}
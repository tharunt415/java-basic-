import java.io.*;
import java.util.Scanner;
class Fibonacci{
    public static void main(String[] args){
        int n, n1=0, n2=1,sum=0;
        System.out.println("Enter range:");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        System.out.print(n1+" "+n2);
        for(int i=2;i<n;i++){
            sum=n1+n2;
            System.out.print(" "+sum);
            n1=n2; n2=sum;
        }
    }
}

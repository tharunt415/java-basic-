import java.io.*;
import java.util.Scanner;
public class PrimeNumber{
    public static void main(String args[]){
        System.out.println("Enter a number to check:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(primecheck(num)){
            System.out.println("PRIME");
        }
        else{
            System.out.println("NOT PRIME");
        }
    }
    static boolean primecheck(int num){
        boolean flag=true;
        if(num<=1){
            return false;
        }
        else{
            for(int i=2;i<=num/2;i++){
                if(num%i==0){
                    return false;
                }
            }
        }
        return true;
    }
}

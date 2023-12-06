import java.io.*;
import java.util.Scanner;
class Armstrong{
    public static void main(String[] args){
        System.out.println("Enter a number to check:");
        Scanner s=new Scanner(System.in);
        int num=s.nextInt(); 
        int temp=num,r,n,sum=0;
        while(num>0){
            r=num%10;
            num=num/10;
            sum=sum+(r*r*r);
        }
        if(temp==sum){
            System.out.println("ARMSTRONG NUMBER");
        }
        else{
            System.out.println("NOT ARMSTRONG NUMBER");
        }
    }
}

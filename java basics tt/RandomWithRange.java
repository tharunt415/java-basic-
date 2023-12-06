import java.io.*;
import java.util.Scanner;
import java.lang.Math;
class RandomWithRange{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number..");
        int start=sc.nextInt();
        System.out.println("Enter last number..");
        int stop=sc.nextInt();
        int rand=(int)(Math.random()*(start-stop+1)+stop);
        System.out.println("Random number between "+start+" and "+stop+"=> "+rand);
    }
}
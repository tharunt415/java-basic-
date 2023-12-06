import java.io.*;
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;
class RandomWithoutRange{
    public static void main(String[] args){
        //method 1
        Random rand=new Random();
        System.out.println("Using method 1..");
        int rni=rand.nextInt(); //generates random integer number
        System.out.println("Random integer number: "+rni);
        
        float rnf=rand.nextFloat(); //generates random floating point number
        System.out.println("Random floating point number: "+rnf);
        
        long rnl=rand.nextLong(); //generates random long number
        System.out.println("Random long number: "+rnl);
        System.out.println();
        //method 2
        System.out.println("Using method 2..");
        System.out.println("Random number 1: "+Math.random());
        System.out.println("Random number 2: "+Math.random());
        System.out.println("Random number 3: "+Math.random());
    }
}
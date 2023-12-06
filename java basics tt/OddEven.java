import java.io.*;
public class OddEven{
    public static void main(String[] args){
        Odd oobj=new Odd();
        oobj.oddcheck();
        Even eobj=new Even();
        eobj.evencheck();
    }
}
class Odd{
        void oddcheck(){
            System.out.println("Odd numbers between 1 to 100..");
            for(int i=1;i<=100;i++){
                if((i%2)!=0)
                    System.out.print(i+" ");
            }
        }
}
class Even{
        void evencheck(){
            System.out.println();
            System.out.println("Even numbers between 1 to 100..");
            for(int i=1;i<=100;i++){
                if((i%2)==0)
                    System.out.print(i+" ");
            }
        }
}
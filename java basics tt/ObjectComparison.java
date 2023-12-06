import java.io.*;
public class ObjectComparison{
    public static void main(String[] args){
        Integer a = new Integer(12);
        String b = new String("abc"); 
        Double c = new Double(123456789.999);
        System.out.println(a.equals(b)); //false
        System.out.println(a.equals(12)); //true
        System.out.println(b.equals("abc")); //true
        System.out.println(c.equals(123456789.999)); //true
}
}

import java.util.Scanner;


public class javaBasics {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        int a =10;
        long b= a;

        // long a = 10;
        // int b =a;

        //Long to int conversion is not possible because long datatype require 8 bytes in the compiler and int capacity is 4 bytes.

        System.out.println(b);

        //byte-short-int-float-long-double - we can only convert data in this format. 

        //lossy conversion(Explicit Conversion) - A conversion in which there is a chances of data losses.

        Scanner sc = new Scanner(System.in);

        // int num = sc.nextFloat();
        // System.out.println(num);

        float num = sc.nextInt();
        System.out.println(num);

        sc.close();
    }
}

import java.util.Scanner;

public class sumOfFirstNNatNum {

    //Sum of first n Natural numbers
    public static void main(String[] args) {
        System.out.println("Enter a Natural number : ");
        System.out.println("sumOfFirstNNatNum.main()");

        int num = new Scanner(System.in).nextInt();

        int sum = 0;

        for (int i = 0; i <= num; i++) {
            sum += i;
        }
        System.out.println("First way Sum of First N natural number : " + sum);

        //Second way
        sum = (num * (num + 1)) / 2;
        System.out.println("Second way Sum of First N natural number : " + sum);

    }

}

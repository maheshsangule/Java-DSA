
public class MaxOf3Num {

    public static void main(String[] args) {

        int num1 = 20, num2 = 10, num3 = 0;

        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println("Num1 is Greater");
            } else {
                System.out.println("Num3 is Greater");
            }
        } else if (num1 == num2 && num2 == num3 && num3 == num1) {
            System.out.println("All numbers are same");
        } else {
            if (num2 > num3) {
                System.out.println("Num2 is Greater");
            } else {
                System.out.println("Num3 is Greater");
            }
        }

    }
}

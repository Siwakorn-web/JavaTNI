import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab202 {
    public static void main(String[] args) {

        DecimalFormat frm = new DecimalFormat("#,###.00");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int num1 = sc.nextInt();

        System.out.print("Enter number 2: ");
        int num2 = sc.nextInt();

        System.out.println("Summation = "+(num1+num2));
        System.out.println("Subtraction = "+(num1-num2));
        System.out.println("Multiplication = "+(num1*num2));
        System.out.println("Division = "+(num1/num2));
        System.out.println("Module = "+(num1%num2));


    }
}

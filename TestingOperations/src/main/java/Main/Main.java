package Main;
import java.util.*;
import MathFunc.MathFunc;

public class Main {
    public static void main(String[] args)
    {
        double num1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        num1 = sc.nextDouble();
        System.out.println("The factorial of your number equals");
        System.out.println(MathFunc.factorial(num1));
        System.out.println("Enter the exponent");
        double exp = sc.nextDouble();
        System.out.println("The exponent of your number equals");
        System.out.println(MathFunc.power(num1, exp));
        System.out.println("The logarithm of your number equals");
        System.out.println(MathFunc.logarithm(num1));
    }
}
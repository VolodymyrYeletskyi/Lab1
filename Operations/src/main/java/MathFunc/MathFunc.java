package MathFunc;
public class MathFunc {
    public static double factorial(double n)
    {
        double result = 1;
        if(n == 0)
        {
            return 1;
        }
        for(int i = 1; i <= n; i++)
        {
            result *= i;
        }
        return result;
    }
    public static double power(double base, double pow)
    {
        if(pow == 0)
        {
            return 1;
        }
        if(pow < 0)
        {
            base = 1 / base;
        }
        double result = base;
        for(int i = 0; i < pow - 1; i++)
        {
            result *= base;
        }
        return result;
    }
    public static double logarithm(double n)
    {
        return Math.log(n);
    }
}
public class Percentages
{
    public static void main (String args[])
    {
        double num1 = 1.5, num2 = 6.5;
        computePercent(num1, num2);
        computePercent(num2, num1);
    }
    public static void computePercent(double x, double y)
    {
        System.out.println(x + " is " + (x / y) * 100 + " percent of " + y);
    }
}
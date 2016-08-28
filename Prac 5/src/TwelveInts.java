public class TwelveInts
{
    public static void main (String args[])
    {
        int[] numbers = {1, 2, 4, 3, 5, 6, 7, 8, 9, 10, 11, 13};
        int i;
        for (i = 0; i < numbers.length; i++)
            System.out.print(numbers[i] + "  ");
        System.out.println();
        for (i = numbers.length - 1; i >= 0; i--)
            System.out.print("" + numbers[i] + "  ");
        System.out.println();
    }
}

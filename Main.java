public class Main {
    public static int  Factorial(int n)
    {
        if(n==0)
        {
            return 1;
        }

        int fact =n*Factorial(n-1);
        return fact;
    }
    public static void main(String[] args)
    {
        int number=5;
        System.out.println(Factorial(number));

    }
}
//package factorials;
public class Factorial {
    static int factorial(int n)
    {
        if (n == 0)
            return 1;

        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        for(int i=0;i<=10;i++){
            System.out.println("Factorial of "+ i + " is " + factorial(i));

    }
    }
}

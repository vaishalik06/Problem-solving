import java.util.ArrayList;

class Factorial {
    public static int factorial(int number) {
        int result = 1;
        for (int i = number; i > 0; i--) {
            result = result * i;
        }
        return result;
    }

    public static void main(String args[]) {
        int result = 0;
        int number = 10;
        result = factorial(number);
        System.out.println("Factorial of " + number + " = " + result);
    }
}
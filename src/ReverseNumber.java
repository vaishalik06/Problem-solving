public class ReverseNumber {
    public static void main(String args[]) {
        int result = 0;
        int number = 63789;
        result = reverseNumber(number);
        System.out.println("Reverse of " + number + " = " + result);
    }

    private static int reverseNumber(int number) {
        int rev = 0;
        while (number > 0) {
            rev = rev * 10 + number % 10;
            number = number / 10;
        }
        return rev;
    }
}

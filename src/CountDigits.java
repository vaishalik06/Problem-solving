public class CountDigits {
    public static void main(String args[]){
        int number = 1;
        int result= countDigits(number);
        System.out.println("Length of "+number+"= "+result);
    }

    private static int countDigits(int number) {
        int count=0;
        while(number>0){
            number = number/10;
            count++;
        }
        return  count;
    }
}

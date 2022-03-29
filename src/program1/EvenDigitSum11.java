package program1;

//Even Digit Sum
//Write a method named getEvenDigitSum with one parameter of type int called number.
//The method should return the sum of the even digits within the number.
//If the number is negative, the method should return -1 to indicate an invalid value.
public class EvenDigitSum11 {
    public static void main(String[] args) {

        getEvenDigitSum(-444);
    }

    public static int getEvenDigitSum(int number) {
        int sum = 0;
        int digit ;
        if (number < 0) {
            System.out.println("-1");
        }
        if (number > 0) {
            while(number!=0) {
                digit = number % 10;
                if (digit % 2 == 0)
                    sum = sum + digit;
                number = number / 10;
                }
            System.out.println(sum);
        }
        return sum;
    }

}

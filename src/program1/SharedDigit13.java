package program1;
//Write a method named hasSharedDigit with two parameters of type int.
//Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
//within the range, the method should return false.
//The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
//otherwise, the method should return false.
public class SharedDigit13 {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,23));
        System.out.println(hasSharedDigit(9,99));
        System.out.println(hasSharedDigit(15,55));
    }

    public static boolean hasSharedDigit(int fnumber, int snumber) {

        if ((fnumber>= 10 && fnumber <= 99) && (snumber >= 10 && snumber <= 99)) {
            int firstnumberlastdigit=fnumber%10;
            int secondnumberlastdigit=snumber%10;
            fnumber/=10;
            snumber/=10;
            int firstnumberfirstdigit=fnumber;
            int secondnumberfirstdigit=snumber;


            return ((firstnumberfirstdigit==secondnumberfirstdigit)||(firstnumberfirstdigit==secondnumberlastdigit)||(firstnumberlastdigit==secondnumberfirstdigit)||(firstnumberlastdigit==secondnumberlastdigit));
        }
        return false;
    }
}

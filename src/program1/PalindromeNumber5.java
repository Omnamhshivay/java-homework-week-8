package program1;
//Palindrome Number
//Write a method called isPalindrome with one int parameter called number.
//The method needs to return a boolean.
//It should return true if the number is a palindrome number otherwise it should return false.
//Check the tips below for more info about palindromes.
//Example Input/Output
//isPalindrome(-1221); → should return true
//isPalindrome(707); → should return true
//isPalindrome(11212); → should return false because the reverse is 21211 and that is not equal to
public class PalindromeNumber5 {
    public static void main(String[] args) {
        m1(12321);
    }

    public static boolean m1(int number) {
        int temp=number;
        int reverse =0;
        while(number!=0){int lastDigit=number%10;
            reverse=reverse*10;
            reverse =reverse+lastDigit;
            number=number/10;
        }
        if(temp==reverse){
            System.out.println(temp+" is palindrome");
            return true;
        }
        else{
            System.out.println(temp+"" + " is not palindrome");
        }
            return false;


    }
}


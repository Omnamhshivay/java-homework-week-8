package program1;

import java.util.Scanner;

//Write a program in Java to display the pattern like a triangle with a number.
//For eg.
//Input number of rows: 10
//Expected Output:
//1
//12
//123
//1234
//12345
//123456
//1234567
//12345678
//123456789
//12345678910
public class DisplayPattern6 {
    public static void main(String[] args) {
        m1();
    }
    public static void m1(){
        System.out.println("input number of rows");

        for(int i=1;i<=10;i++){
            for (int m=1;m<=i;m++) {
                System.out.print(m);

            }System.out.println(" ");
        }
    }
}

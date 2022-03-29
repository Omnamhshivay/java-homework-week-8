package program1;

import java.util.Scanner;

//Write a program in Java to display the pattern like a diamond.
//While loop
public class Diamond14 {
    public static void main(String[] args) {
diamond();
    }
    public static void diamond(){
        int i,j;
        for(i=1;i<=7;i++)
        {
            for(j=1;j<=6-i;j++)
                System.out.print(" ");
            for(j=1;j<=2*i-1;j++)
                System.out.print("*");
            System.out.print("\n");
        }

        for(i=7-1;i>=1;i--)
        {
            for(j=1;j<=6-i;j++)
                System.out.print(" ");
            for(j=1;j<=2*i-1;j++)
                System.out.print("*");
            System.out.print("\n");
        }
    }
}

package program1;

import java.util.Scanner;
//2. -Read the numbers from the console entered by the user and print the minimum
//and maximum number the user has entered.
//-Before the user enters the number, print the message Enter number:
//-If the user enters an invalid number, break out of the loop and print the minimum and maximum
//number.
//Hint:
//-Use an endless while loop.
//-Create a class with the name MinAndMaxInputChallenge.

public class MinAndMaxInputChallenge2 {
    public static void main(String[] args) {

        min();
    }
    public static void min(){
        //int count=1;
        //int num =0;
        int min=0;
        int max=0;
        boolean ismin=false;
        boolean ismax=false;
            Scanner input = new Scanner(System.in);
            while (true) {
                System.out.println("Enter Number: ");
                if (input.hasNextInt()){
                    int num=input.nextInt();
                    if (num>max || !ismax){
                    max=num;
                    ismax=true;
                    }if (num<min || !ismin){
                        min=num;
                        ismin=true;
                    }
                }else{
                    System.out.println("minimum number is "+min);
                    System.out.println("maximum number is "+max);
                    break;
                }
            }

                }
            }






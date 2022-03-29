package program1;
//Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
public class FibonacciNumber9 {
    public static void main(String[] args) {
     fibonacci();
    }

    public static void fibonacci() {
        int maxNumber = 8;
        int previousNumber = 1;
        int nextNumber = 1;

        System.out.print("Fibonacci Series of " + maxNumber + " numbers:");

        for (int i = 1; i <= maxNumber; ++i) {
            System.out.print(previousNumber + " ");
            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;

        }
    }
}

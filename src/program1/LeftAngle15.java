package program1;
//Display left angle triangle of * using nested for loops

public class LeftAngle15 {
    public static void main(String[] args) {
        left();
    }

    public static void left() {

        for (int x = 1; x <= 5; x++)
        {
            for (int i = 1; i <= x; i++)
            {
                System.out.print("*");
            }

            System.out.println("");
    }
}
}
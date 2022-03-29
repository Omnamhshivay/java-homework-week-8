package program1;
//Display right angle triangle of @ using nested for loops
//@
//@@
//@@@
//@@@@
//@@@@@
public class AngleTriangle8 {
    public static void main(String[] args) {
triangle();
    }
    public static void triangle(){
        for(int i=0;i<5;i++) {
            for (int m = 0; m <= i; m++) {
                System.out.print('@');

            }
            System.out.println(" ");
        }
    }
}

package program1;

public class SimpleCalculator18 {
    double firstNumber;
    double secondNumber;

    public double getFirstNumber(){
        return firstNumber;
    }
    public double getSecondNumber(){
        return secondNumber;
    }
    public void setFirstNumber(double firstNumber){
        this.firstNumber=firstNumber;
    }
    public void setsecondNumber(double secondNumber){
        this.secondNumber=secondNumber;
    }public double getAdditionResult(){
        double total=this.firstNumber+this.secondNumber;
        return total;
    }public double getSubtractionResult(){
        double subtraction=this.firstNumber-this.secondNumber;
        return subtraction;
    }
    public double getMultiplicationResult(){
        double multiplication=this.firstNumber*this.secondNumber;
        return multiplication;
    }
    public double getDivisionResult() {
        double division = this.firstNumber / this.secondNumber;
        if (this.secondNumber == 0) {
            division = 0;
        } else {
            division = this.firstNumber / this.secondNumber;

        }
        return division;
    }

    public static void main(String[] args) {
        SimpleCalculator18 calculator = new SimpleCalculator18();
        calculator.setFirstNumber(5.0);
        calculator.setsecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setsecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());
    }
}

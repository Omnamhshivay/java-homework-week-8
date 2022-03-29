package cylinder;

public class Circle {
    double redius;

    Circle(double redius) {
        if (redius < 0) {
            this.redius = 0;
        }else{
            this.redius=redius;
        }
    }
    public double getRedius() {
        return redius;
    }
    public double getArea(){
        double area= redius*redius*Math.PI;
        return area;
    }

}
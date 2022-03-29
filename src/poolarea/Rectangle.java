package poolarea;

public class Rectangle {
    double width;
    double lenght;
    Rectangle(double wight, double lenght){
        this.width=wight;
        this.lenght=lenght;
        if (wight<0 && lenght<0){
            width=0;
            lenght=0;
        }else{
            this.width=wight;
            this.lenght=lenght;
        }

    }
    public double getWidth(){
        return width;
    }
    public double getLenght(){
        return lenght;
    }
    public double getArea(){
        double area=width*lenght;
        return area;
    }
}

package carpetcalculator;

public class Floor {
    double width;
    double lenght;
    Floor(double width, double lenght){
        this.width=width;
        this.lenght=lenght;
        if(width<0 && lenght<0){
            this.width=0;
            this.lenght=0;
        }else {
            this.width=width;
            this.lenght=lenght;
        }


    }public double getArea(){
        double area = width*lenght;
        return area;
    }
}

package cylinder;

public class Cylinder extends Circle{
    double height;
    Cylinder(double raduis ,double height){
        super(5.5);
        if(height<0){
         height=0;
        }else{
            this.height=height;
        }

    }
    public double getHeight(){
        return height;
    }
    public double getVolume(){
        double volume=super.getArea()*height;
        return volume;
    }

}

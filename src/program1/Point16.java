package program1;

import java.awt.*;

public class Point16 {
    int x;
    int y;
    Point16() {
    }
    Point16(int x, int y) {
        this.x = x;
        this.y=y;
    }
    public int getX() {
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    public void setX(int x){
        this.x=x;
    }
    public void setY(int y){
        this.y=y;
    }
    public double distance(){
        return Math.sqrt((0-this.getX())*(0-this.getX())+(0-this.getY())*(this.getY()));
    }
    public double distance(int x,int y){
        return Math.sqrt((x-this.getX())*(x-this.getX())+(y-this.getY())*(y-this.getY()));
    }
    public double distance(Point16 second){
        return Math.sqrt((second.getX()-this.getX())*(second.getX()-this.getX())+(second.getY()-this.getY())*(second.getY()-this.getY()));
    }
    public static void main(String[] args) {
        Point16 first = new Point16(6, 5);
        Point16 second = new Point16(3, 1);
        System.out.println("distance(0,0)= " + first.distance());

        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point16 point = new Point16();
        System.out.println("distance()= " + point.distance());
    }

}
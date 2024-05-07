package week4.programme19_Cylinder;

public class Programme19_Circle {
    double radius;

    Programme19_Circle(double radius) {
        if(radius<0){
            radius=0;
        }
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public double getArea(){
        double PI = Math.PI;
        return radius*radius*PI;
    }
}
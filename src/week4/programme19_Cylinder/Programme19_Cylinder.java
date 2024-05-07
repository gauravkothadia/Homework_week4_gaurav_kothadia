package week4.programme19_Cylinder;

public class Programme19_Cylinder extends Programme19_Circle{
    double height;
    Programme19_Cylinder(double radius, double height){
        super(radius);
        if(height<0){
            height=0;
        }
        this.height=height;
    }
    public double getHeight(){
        return height;
    }

    public double getVolume(){
        return getArea()*height;
    }

    
}

package week4.programme20_PoolArea;

public class Programme20_Cuboid extends Programme20_Rectangle{
    double height;

    Programme20_Cuboid(double width, double length, double height1){
        super(width, length);
        if(height1<0){
            height1=0;
        }
        this.height=height1;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume(){
        return getArea()*height;
    }
}
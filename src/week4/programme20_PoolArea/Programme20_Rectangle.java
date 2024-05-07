package week4.programme20_PoolArea;

public class Programme20_Rectangle {
    double width;
    double length;

    Programme20_Rectangle(double width1, double length1){
        if(width1<0){
            width1=0;
        }
        if(length1<0){
            length1=0;
        }
        this.length=length1;
        this.width=width1;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea() {
        return width*length;
    }

}
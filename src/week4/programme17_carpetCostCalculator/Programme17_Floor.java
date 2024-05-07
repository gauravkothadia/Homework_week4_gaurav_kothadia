package week4.programme17_carpetCostCalculator;

public class Programme17_Floor {
    double width;
    double length;

    Programme17_Floor(double x, double y){
        if(x<0)
            x=0;
        if(y<0)
            y=0;

        this.width = x;
        this.length=y;
    }

    public double getArea(){
        return width*length;
    }
}

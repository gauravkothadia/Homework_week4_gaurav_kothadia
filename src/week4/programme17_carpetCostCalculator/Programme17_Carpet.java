package week4.programme17_carpetCostCalculator;

public class Programme17_Carpet {
    double cost;

    Programme17_Carpet(double cost) {
        if(cost<0) {
            cost = 0;
        }
        this.cost = cost;
    }
    public double getCost(){
        return cost;
    }
}

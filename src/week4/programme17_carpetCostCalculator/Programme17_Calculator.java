package week4.programme17_carpetCostCalculator;

public class Programme17_Calculator {
    Programme17_Floor floor;
    Programme17_Carpet carpet;

    Programme17_Calculator(Programme17_Floor floor1, Programme17_Carpet carpet1){
        this.floor=floor1;
        this.carpet=carpet1;
    }

    public double getTotalCost(){
        return floor.getArea() * carpet.getCost();
    }
}

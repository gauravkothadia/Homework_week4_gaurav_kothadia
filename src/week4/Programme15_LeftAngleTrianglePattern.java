package week4;

/**
 * 15. Display left angle triangle of * using nested for loops
 *          *
 *        * *
 *      * * *
 *    * * * *
 *  * * * * *
 */
public class Programme15_LeftAngleTrianglePattern {
    public static void main(String[] args) {
        Programme15_LeftAngleTrianglePattern abc = new Programme15_LeftAngleTrianglePattern();
        abc.leftAngleTriangle();
    }

    public void leftAngleTriangle(){
        for(int i=1; i<=5; i++){
            for(int j=5; j>i; j--){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

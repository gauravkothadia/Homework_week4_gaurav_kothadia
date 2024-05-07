package week4;

/**
 * 8. Display right angle triangle of @ using nested for loops
 *  @
 *  @@
 *  @@@
 *  @@@@
 *  @@@@@
 */
public class Programme08_RightAngleTrianglePattern {
    public void pattern(){
        for(int i=1; i<=5;i++){
            for(int j=1; j<=i; j++){
                System.out.print("@");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Programme08_RightAngleTrianglePattern p = new Programme08_RightAngleTrianglePattern();
        p.pattern();
    }
}

package week4;

/**
 * 14. Write a program in Java to display the pattern like a diamond.
 *  While loop
 *       *
 *      ***
 *     *****
 *    *******
 *   *********
 *  ***********
 * *************
 *  ***********
 *   *********
 *    *******
 *     *****
 *      ***
 *       *
 */
public class Programme14_DiamondPattern {
    public void patternDiamond(){
        char ch = '*';
        for(int i=1; i<=6; i++){
            for(int j=6; j>=i; j--){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print("*");
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Programme14_DiamondPattern patt = new Programme14_DiamondPattern();
        patt.patternDiamond();
    }
}

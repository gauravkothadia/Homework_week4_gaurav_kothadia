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
        int rows = 13; // Number of rows for the diamond (should be odd for symmetry)
        int spaces = rows / 2;
        int stars = 1;

        // Print upper half of the diamond
        int i = 0;
        while (i < rows / 2 + 1) {
            int j = 0;
            while (j < spaces) {
                System.out.print(" ");
                j++;
            }
            j = 0;
            while (j < stars) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            spaces--;
            stars += 2;
            i++;
        }

        // Print lower half of the diamond
        spaces = 1;
        stars = rows - 2;
        i = 0;
        while (i < rows / 2) {
            int j = 0;
            while (j < spaces) {
                System.out.print(" ");
                j++;
            }
            j = 0;
            while (j < stars) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            spaces++;
            stars -= 2;
            i++;
        }
    }

    public static void main(String[] args) {
        Programme14_DiamondPattern patt = new Programme14_DiamondPattern();
        patt.patternDiamond();
    }
}

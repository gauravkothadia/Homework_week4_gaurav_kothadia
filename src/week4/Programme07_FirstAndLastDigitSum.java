package week4;

/**
 * 7. First And Last Digit Sum
 * Write a method named sumFirstAndLastDigit with one parameter of type int called number.
 * The method needs to find the first and the last digit of the parameter number passed to the method,
 * using a loop and return the sum of the first and the last digit of that number.
 * If the number is negative then the method needs to return -1 to indicate an invalid value.
 * Example input/output
 * * sumFirstAndLastDigit(252); →should return 4, the first digit is 2 and the last is 2 which gives us 2+2 and the sum is 4.
 * * sumFirstAndLastDigit(257); →should return 9, the first digit is 2 and the last is 7 which gives us 2+7 and the sum is 9.
 * * sumFirstAndLastDigit(0); → should return 0, the first digit and the last digit is 0 since we only have 1 digit, which
 * gives us 0+0 and the sum is 0.
 * * sumFirstAndLastDigit(5); → should return 10, the first digit and the last digit is 5 since we only have 1 digit, which
 * gives us 5+5 and the sum is 10.
 * * sumFirstAndLastDigit(-10); → should return -1, since the parameter is negative and needs to be positive.
 * NOTE: The method sumFirstAndLastDigit needs to be defined as public static
 */
public class Programme07_FirstAndLastDigitSum {
    static int lastDigit, firstDigit, sum;

    public static int sumFirstAndLastDigit(int number) {
        // reversing the number method
        int reverse = 0;
        int count = 0;
        if (number >= 10) {                     // to process valid data
            while (number >= 10) {
                reverse = reverse + (number % 10);
                count++;
                if (count == 1) {
                    lastDigit = reverse;
                }
                number = number / 10;
                reverse = reverse * 10;
            }
            firstDigit = number;
            sum = firstDigit + lastDigit;
        } else if (number < 10 && number >= 0) {
            firstDigit = number;
            lastDigit = number;
            sum = firstDigit + lastDigit;
        } else {
            return -1;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] testData = {252, 257, 0, 5, -10};
        for (int testNumber : testData) {
            int result = sumFirstAndLastDigit(testNumber);
            if (result == -1) {
                System.out.println(testNumber + " needs to be positive number. Returns -1.");
            } else {
                System.out.println(testNumber + " returns sum of first and last digit as " + result);
            }
        }
    }
}
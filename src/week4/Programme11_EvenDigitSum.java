package week4;

import java.util.Scanner;

/**
 * 11. Even Digit Sum
 * Write a method named getEvenDigitSum with one parameter of type int called number.
 * The method should return the sum of the even digits within the number.
 * If the number is negative, the method should return -1 to indicate an invalid value.
 * EXAMPLE INPUT/OUTPUT:
 * * getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
 * * getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
 * * getEvenDigitSum(-22); → should return -1 since the number is negative
 * NOTE: The method getEvenDigitSum should be defined as public static
 */
public class Programme11_EvenDigitSum {
    public static int getEvenDigitSum(int number){
        int sum=0;
        int reminder=0;
        if(number>0){
            while(number>=1){
                reminder = number%10;
                number = number/10;
                if(reminder%2==0){
                    sum +=reminder;
                }
            }
            return sum;
        }else{
            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter any numbers.");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println("Sum of even digit(s) in "+input+" is "+getEvenDigitSum(input));
    }
}
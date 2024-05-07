package week4;

import java.util.Scanner;

/**
 * 10. Write a program to input any number and check if it Armstrong number or not
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)
 * where:
 * (1*1*1)=1
 * (5*5*5)=125
 * (3*3*3)=27
 * So:
 * 1+125+27=153
 */
public class Programme10_ArmstrongNumberCheck {
    int originalNumber;
    int result;

    Programme10_ArmstrongNumberCheck(int num) {
        originalNumber = num;
    }

    public String isArmstrongNumber(int num) {
        int cubeOfDigit=1;
        int counter=0;
        int sum=0;
        while (num >= 1) {
            int digit = num % 10;
            counter++;
            num = num / 10;
            cubeOfDigit = digit*digit*digit;
            sum = sum + cubeOfDigit;
            cubeOfDigit=1;
        }
        if(sum==originalNumber){
            return "Armstrong number.";
        }else{
            return "Not an Armstrong number.";
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the Number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        Programme10_ArmstrongNumberCheck arm = new Programme10_ArmstrongNumberCheck(number);
        System.out.println(number + " is " + arm.isArmstrongNumber(number));
    }
}

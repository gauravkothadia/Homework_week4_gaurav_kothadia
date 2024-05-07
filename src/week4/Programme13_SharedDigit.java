package week4;

import java.util.Scanner;

/**
 * 13. Shared Digit
 * Write a method named hasSharedDigit with two parameters of type int.
 * Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
 * within the range, the method should return false.
 * The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
 * otherwise, the method should return false.
 * EXAMPLE INPUT/OUTPUT:
 * * hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
 * * hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
 * * hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
 * NOTE: The method hasSharedDigit should be defined as public static
 */
public class Programme13_SharedDigit {
    public static boolean hasSharedDigit(int num1, int num2){
        if(num1>=10 && num1<=99 && num2>=10 && num2<=99){
            int[] array1 = arrayConversion(num1);
            int[] array2 = arrayConversion(num2);
            for(int i=0; i<array1.length; i++){
                for(int j=0; j<array2.length; j++){
                    if(array1[i]==array2[j]){
                        return true;
                    }
                }
            }
            return false;
        }else{
            return false;
        }

    }

    public static int[] arrayConversion(int number1){
        int[] numberArray;
        int count=0;
        int originalNumber = number1;
        while (number1>=1){
            int rem = number1%10;
            number1 = number1/10;
            count++;
        }
        numberArray = new int[count];
        number1 = originalNumber;
        for(int i=0; i<count; i++){
            numberArray[i]=number1%10;
            number1 = number1/10;
        }
        return numberArray;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();
        System.out.println(hasSharedDigit(firstNumber,secondNumber));
    }
}

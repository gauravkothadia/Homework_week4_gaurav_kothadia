package week4;

import java.util.Scanner;

/**
 * 2. -Read the numbers from the console entered by the user and print the minimum
 * and maximum number the user has entered.
 * -Before the user enters the number, print the message Enter number:
 * -If the user enters an invalid number, break out of the loop and print the minimum and maximum
 * number.
 * Hint:
 * -Use an endless while loop.
 * -Create a class with the name MinAndMaxInputChallenge.
 */
public class MinAndMaxInputChallenge {
    int min;
    int max;

    MinAndMaxInputChallenge(){
        min=0;
        max=0;
    }

    public void inputProcessing(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter number: ");
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                int number = scanner.nextInt();
                minNumber(number);
                maxNumber(number);
            } else {
                break;
            }
            scanner.nextLine(); // handle end of line (enter key)
        }
        scanner.close(); // closing the scanner.
    }

    public void minNumber(int a){
        if(a<min){
            min = a;
        }
    }

    public void maxNumber(int a){
        if(a>max){
            max=a;
        }
    }

    public static void main(String[] args) {
        MinAndMaxInputChallenge ch = new MinAndMaxInputChallenge();
        ch.inputProcessing();
        System.out.println("Minimum number: "+ch.min);
        System.out.println("Maximum number: "+ch.max);
    }
}

package week4;

import java.util.Scanner;

/**
 * 1. Read 10 numbers from the console entered by the user and print the sum of those
 * numbers.
 * -Use the hasNextInt() method from the scanner to check if the user has entered an int value.
 * -If hasNextInt() returns false, print the message Invalid Number. Continue reading until you have read
 * 10 numbers.
 * -Use the nextInt() method to get the number and add it to the sum.
 * -Before the user enters each number, print the message Enter number #x: where x represents the
 * count, i.e. 1, 2, 3, 4, etc.
 * -For example, the first message printed to the user would be Enter number #1:, the next Enter number
 * #2:, and so on.
 * Hint:
 * -Use a while loop.
 * -Use a counter variable for counting valid numbers.
 * -Close the scanner after you don't need it anymore.
 * -Create a class with the name ReadingUserInputChallenge.
 */
public class Programme01_ReadingUserInputChallenge {
    int sum;
    int count;

    //constructor initialising the instance variables.
    Programme01_ReadingUserInputChallenge(){
        sum=0;
        count=0;
    }

    //method for sum of numbers
    public void addingNumbers(int a){
        sum = sum+a;
    }

    public void inputProcessing(){
        Scanner scanner = new Scanner(System.in);
        while (count < 10) {
            int order = count + 1;
            System.out.println("Enter number #" + order + ":");
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                int number = scanner.nextInt();
                count++;
                addingNumbers(number);
            } else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine(); // handle end of line (enter key)
        }
        scanner.close(); // closing the scanner.
    }
    public static void main(String[] args) {
        Programme01_ReadingUserInputChallenge input = new Programme01_ReadingUserInputChallenge();
        System.out.println("Please enter 10 numbers to obtain its sum.");
        input.inputProcessing();
        System.out.println("Sum of all numbers is: "+input.sum);
    }
}

package week4;

import java.util.Scanner;

/**
 * 9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */
public class Programme09_FibonacciNumberSeries {

    public void fibonacciSeries(int a){
        int num1 = 1;
        int num2 = 1;
        System.out.print(num1+" , ");
        for(int i=0; i<=a; i++){
            System.out.print(num2+" , ");
            int num3 = num1+num2;
            num1=num2;
            num2=num3;
        }
    }

    public static void main(String[] args) {
        Programme09_FibonacciNumberSeries fb = new Programme09_FibonacciNumberSeries();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements to print for the Fibonacci series: ");
        int input = scanner.nextInt();
        fb.fibonacciSeries(input);
        scanner.close();
    }
}

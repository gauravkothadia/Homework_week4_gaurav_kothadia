package week4;

import java.util.Scanner;

/**
 * 12. Write a programme to input any number and check if it is prime or not.
 * (Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
 * prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
 * 17.... are the prime numbers.)
 */
public class Programme12_PrimeNumberCheck {
    public String checkPrime(int number){
        int count=0;
        for(int i=1; i<=number; i++){
            if(number%i==0){
                count++;
            }
        }
        if(count<=2){
            return " is Prime number.";
        }else{
            return " is NOT Prime number.";
        }
    }

    public static void main(String[] args) {
        Programme12_PrimeNumberCheck prime = new Programme12_PrimeNumberCheck();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number of your choice.");
        int input = scanner.nextInt();
        System.out.println(input+""+prime.checkPrime(input));
        scanner.close();
    }
}

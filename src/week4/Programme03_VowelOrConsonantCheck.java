package week4;

import java.util.Scanner;

/**
 * 3. Write a Java program that takes the user to provide a single character from the
 *  alphabet. Print Vowel of Consonant, depending on the user input. If the user input
 *  Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
 * error message.
 * For eg:
 *  Input an alphabet: p
 *  Expected Output:
 *  Input letter is Consonant
 */
public class Programme03_VowelOrConsonantCheck {
    public void inputProcessing(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter character: ");
        String ch = scanner.next();
        if(ch.length()==1){
            char c = ch.toLowerCase().charAt(0);
            if(Character.isAlphabetic(c)){
                if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                    System.out.println(ch+" is a Vowel.");
                }else{
                    System.out.println(ch+" is a Consonant.");
                }
            } else{
                System.out.println(ch+" is neither Vowel nor Consonant.");
            }
        }else {
            System.out.println("Invalid input. Only one character entry required.");;
        }
        scanner.close(); // closing the scanner.
    }

    public static void main(String[] args) {
        Programme03_VowelOrConsonantCheck vowelOrConsonantCheck = new Programme03_VowelOrConsonantCheck();
        vowelOrConsonantCheck.inputProcessing();
    }
}

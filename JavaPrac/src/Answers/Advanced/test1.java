package Answers.Advanced;

import java.util.Scanner;

public class test1 {

    /*Let the user enter a word with more than 3 digits,
    If it is less than or equal to three digits, let the user re-enter it until input is more than 3 digits.
    Output the first letter and increase the letter to complete the word by each line
    */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please input a word with more than 3 digits:");
        String x = input.next();
        while (x.length() <= 3) {
            System.out.print("The word is not more than 3 digits.\nPlease re-enter: ");
            x = input.next();
        }
        for (int i = 1; i <= x.length(); i++) {
            System.out.println(x.substring(0, i));
        }

    }
}


package Answers.Advanced;

import java.util.Scanner;

public class test2 {

    /*Let the user enter a word with more than 3 digits,
    If it is less than or equal to three digits, let the user re-enter it until input is more than 3 digits.
    Output the word backwards and start from the last letter
    and increase the letter to complete the word backwards by each line
    and decrease the letter to the last letter by each line
    */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please input a word with more than 3 digits:");
        String x = input.next();
        while (x.length() <= 3) {
            System.out.print("The word is not more than 3 digits.\nPlease re-enter: ");
            x = input.next();
        }
        char[] c = x.toCharArray();
        String s = "";
        for (int i = c.length - 1; i >= 0; i--) {
            s += c[i] + "";
            System.out.println(s);
        }
        for (int i = s.length(); i >= 0; i--) {
            System.out.println(s.substring(0,i));
        }
    }

}

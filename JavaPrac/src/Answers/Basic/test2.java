package Answers.Basic;

import java.util.Scanner;

public class test2 {

/*    Let the user enter a word to determine whether the word is 4 digits.
    If more than four digits, output how many digits more
    If it is equal to four digits, output the word
    If there are less than four digits,  output how many digits missing*/

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            Scanner input = new Scanner(System.in);
            System.out.print("Please input a word:");
            String x = input.next();
            int a = x.length();
            if (a < 4) {
                System.out.println(4 - a);
            } else if (a > 4) {
                System.out.println(a - 4);
            } else {
                System.out.println(x);
            }
        }
        System.out.println("The repeatable input in the picture is just to show all the outputs in one picture.\nIt does not have to be completed.");
    }

}

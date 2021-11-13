package Answers.Hard;

import java.util.Scanner;

public class test1 {

    /*Define a String array with length of 6,
    allowing the user to enter six values at one time (separated by commas).
    Fill the array with the six values entered by the user and print the array
    let the user enter a letter and determine whether there is this letter in the array
    if true, output the position of the letter
    if false, output replace the second letter in the array and print the array.
*/

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] s = new String[6];
        System.out.print("Please enter 6 letters separated by commas: ");
        String x = input.next();
        s = x.split(",");
        for (String m : s) {
            System.out.print(m + " ");
        }
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.print("Please enter a letter: ");
            String a = input.next();
            for (int j = 0; j < s.length; j++) {
                if (a.equals(s[j])) {
                    System.out.println(j + 1);
                    break;
                } else if (j == s.length - 1) {
                    s[1] = a;
                    for (String m : s) {
                        System.out.print(m + " ");
                    }
                    System.out.println();
                }
            }
        }
        System.out.println("The repeatable input in the picture is just to show all the outputs in one picture.\nIt does not have to be completed.");
    }
}

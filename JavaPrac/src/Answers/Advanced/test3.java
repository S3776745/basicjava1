package Answers.Advanced;


import java.util.Scanner;

public class test3 {

/*    Define a String Multidimensional array of length [5][2] for register student's names and scores.
    Let user enters 3 names and 3 scores.
    output how much the average score of the remaining students need to get,
    so that the total average score of 5 students can exceed 80.*/

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][] s = new String[5][2];
        double m = 0;
        for (int i = 0; i < 3; i++) {
            System.out.print("Name: ");
            s[i][0] = input.next();
            System.out.print("Score: ");
            s[i][1] = input.next();
            System.out.println(s[i][0] + " " + s[i][1]);
            m += Integer.parseInt(s[i][1]);
        }
        System.out.println("The rest 2 students need to get at least " + (400 - m) / 2 + "\nso that the total average score of 5 students can exceed 80.");
    }
}

package Answers.Basic;

import java.util.Scanner;

public class test4 {

/*    Let the user enter a word and output the word with the first letter removed
    If there is only one letter, output this letter*/

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("Please enter a word:");
            String x = input.next();
            if (x.length()>1){
                System.out.println(x.substring(1));
            }else{
                System.out.println(x);
            }
        }
        System.out.println("The repeatable input in the picture is just to show all the outputs in one picture.\nIt does not have to be completed.");
    }

}

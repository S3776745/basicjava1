package Answers.Basic;

import java.util.Scanner;

public class test5 {

    //Let the user enter a paragraph of text, add a question mark after each letter and print out

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter some text:");
        String x = input.next();
        for (int i=0;i<x.length();i++){
            System.out.print(x.charAt(i)+"?");//subString(i,i+1) will do as well
        }
    }
}

package Answers.Basic;

import java.util.Scanner;

public class test3 {

/*    Let the user enter a value from 1-12, and output the corresponding month.
    If the user enters a value other than 1-12, the user is prompted to enter a value of 1-12.*/


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("Please enter between 1-12:");
            switch (input.next()) {
                case "1":
                    System.out.println("January");
                    break;
                case "2":
                    System.out.println("February");
                    break;
                case "3":
                    System.out.println("March");
                    break;
                case "4":
                    System.out.println("April");
                    break;
                case "5":
                    System.out.println("May");
                    break;
                case "6":
                    System.out.println("June");
                    break;
                case "7":
                    System.out.println("July");
                    break;
                case "8":
                    System.out.println("August");
                    break;
                case "9":
                    System.out.println("September");
                    break;
                case "10":
                    System.out.println("October");
                    break;
                case "11":
                    System.out.println("November");
                    break;
                case "12":
                    System.out.println("December");
                    break;
                default:
                    System.out.println("Make sure you enter between 1-12");
                    break;
            }
        }
        System.out.println("The repeatable input in the picture is just to show all the outputs in one picture.\nIt does not have to be completed.");
    }

}

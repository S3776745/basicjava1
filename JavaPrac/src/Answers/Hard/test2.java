package Answers.Hard;

import java.util.Scanner;

public class test2 {

/*  Define an int array of length 6,
    Let the user enter six numbers greater than zero at once (separated by comma)
    Fill the array with the six values entered by the user.
    use try & catch, if the user enters something that's not number,
    Show that only numbers can be entered, allowing the user to re-enter.
    Sort the array from smallest to largest
    print the array.
    */

    public static void main(String[] args) {
        int[] a = new int[6];
        Scanner input = new Scanner(System.in);
        String x;
        while (true) {
            System.out.print("Please enter 6 numbers separated by comma: ");
            try {
                x = input.next();
                String[] ss = x.split(",");
                for (int i = 0; i < a.length; i++) {
                    a[i] = Integer.parseInt(ss[i]);
                }
                break;
            } catch (Exception e) {
                System.out.println("Make sure you enter all numbers.");
            }
        }
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int m = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = m;
                }
            }
        }
        for (int m : a) {
            System.out.print(m + " ");
        }

    }

}

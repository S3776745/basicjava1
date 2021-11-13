package Answers.Basic;

public class test6 {

/*
    Define a String array with a value of 1, 2, 3, 4, 5, 6,
    Convert it into an int array.
    print the array and the sum of all the elements in the array.
*/

    public static void main(String[] args) {
        String[] s = {"1", "2", "3", "4", "5", "6"};
        int[] a = new int[s.length];
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(s[i]);
            System.out.print(a[i]+" ");
            sum += a[i];
        }
        System.out.println("\nSum: "+sum);
    }

}

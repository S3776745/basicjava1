package Answers.Basic;

public class test1 {

//    Please define an int array with a length of 8, fill it from 8 to 1 and print it.

    public static void main(String[] args) {
        int[] a = new int[8];
        for (int i = 0; i < a.length; i++) {
            a[i] = a.length - i;
            System.out.println(a[i]);
        }
    }

}

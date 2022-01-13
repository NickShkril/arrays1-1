package ru.skypro;

public class Main {

    public static void main(String[] args) {
        //1st
        int[] number = new int[]{1, 2, 3};

        double[] number2 = {1.57, 7.654, 9.986};

        int[] nubmer3;
        nubmer3 = new int[3];
        nubmer3[0] = 1;
        nubmer3[1] = 2;
        nubmer3[2] = 3;

        //2nd
        int[] num = new int[]{1, 2, 3};
        num[0] = 1;
        for (int i = 0; i < num.length; i++) {
            if (i == num.length - 1) {
                System.out.print(num[i]);
            } else {
                System.out.print(num[i] + ", ");
            }
        }
        System.out.println();

        double[] num2 = {1.57, 7.654, 9.986};
        num2[0] = 1.57;
        for (int a = 0; a < num2.length; a++) {
            if (a == num2.length - 1) {
                System.out.print(num2[a]);
            } else {
                System.out.print(num2[a] + ", ");
            }
        }
        System.out.println();

        int[] num3;
        num3 = new int[3];
        num3[0] = 5;
        num3[1] = 6;
        num3[2] = 7;
        for (int b = 0; b < num3.length; b++) {
            if (b == num3.length - 1) {
                System.out.print(num3[b]);
            } else {
                System.out.print(num3[b] + ", ");
            }
        }
        System.out.println();
        //3rd
        int[] array = new int[]{1, 2, 3};
        for (int c = array.length - 1; c >= 0; c--) {
            if (c == 0) {
                System.out.print(array[c]);
            } else {
                System.out.print(array[c] + ", ");
            }
        }
        System.out.println();

        double[] array2 = {1.57, 7.654, 9.986};
        for (int d = array2.length - 1; d >= 0; d--) {
            if (d == 0) {
                System.out.print(array2[d]);
            } else {
                System.out.print(array2[d] + ", ");
            }
        }
        System.out.println();

        int[] array3;
        array3 = new int[3];
        array3[0] = 5;
        array3[1] = 6;
        array3[2] = 7;
        for (int v = array3.length - 1; v >= 0; v--) {
            if (v == 0) {
                System.out.print(array3[v]);
            } else {
                System.out.print(array3[v] + ", ");
            }
        }
        System.out.println();

        //4th
        int[] arr = {1, 2, 3};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i]++;
            }
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");

            }
        }
    }
}
// why don't commit

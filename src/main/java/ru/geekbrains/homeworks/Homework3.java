package ru.geekbrains.homeworks;

import java.util.Arrays;

public class Homework3 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(shiftArrayElements(arr1, 5)));
        System.out.println(Arrays.toString(shiftArrayElements(arr2, -5)));
    }

    public static int[] shiftArrayElements(int[] array, int n) {
        int valOld;
        while (Math.abs(n) != 0) {
            if (n < 0) {
                for (int i = 0; i < array.length - 1; i++) {
                    valOld = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = valOld;
                }
                n++;
            } else {
                for (int i = array.length - 1; i > 0; i--) {
                    valOld = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = valOld;
                }
                n--;
            }
        }
        return array;
    }
}

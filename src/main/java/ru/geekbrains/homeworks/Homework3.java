package ru.geekbrains.homeworks;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Homework3 {
    public static void main(String[] args) {
        ThreadLocalRandom rnd = ThreadLocalRandom.current();

        int len = rnd.nextInt(7) + 3;
        int[] arr = new int[len];

        for (int i = 0; i < arr.length; i++)
            arr[i] = rnd.nextInt(10);

        int minValue = arr[0];
        int maxValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (minValue > arr[i]) minValue = arr[i];
            if (maxValue < arr[i]) maxValue = arr[i];
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("maxValue = " + maxValue);
        System.out.println("minValue = " + minValue);
    }
}

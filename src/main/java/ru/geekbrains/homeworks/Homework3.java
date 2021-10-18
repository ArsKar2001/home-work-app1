package ru.geekbrains.homeworks;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Homework3 {
    public static void main(String[] args) {
        ThreadLocalRandom rnd = ThreadLocalRandom.current();

        int len = rnd.nextInt(10) + 3;
        int initialValue = rnd.nextInt(10);
        int[] arr = generateArray(len, initialValue);

        System.out.println(Arrays.toString(arr));
    }

    private static int[] generateArray(int len, int initialValue) {
        int[] newArr = new int[len];

        for (int i = 0; i < newArr.length; i++)
            newArr[i] = initialValue;
        // или так :D
        //Arrays.fill(newArr, initialValue);
        return newArr;
    }
}

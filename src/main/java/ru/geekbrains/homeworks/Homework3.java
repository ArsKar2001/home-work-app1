package ru.geekbrains.homeworks;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Homework3 {
    public static void main(String[] args) {
        ThreadLocalRandom rnd = ThreadLocalRandom.current();

        // Сгенерирует случайное число от 5 до 10;
        int n = rnd.nextInt(5) + 5;
        int[][] mas = new int[n][n];

        for (int i = 0, j = 0; i < mas.length; i++, j++)
            mas[i][j] = rnd.nextInt(8) + 1;

        for (int i = mas.length - 1, j = 0; i >= 0; i--, j++)
            mas[i][j] = rnd.nextInt(8) + 1;

        for (int[] member : mas)
            System.out.println(Arrays.toString(member));
    }
}

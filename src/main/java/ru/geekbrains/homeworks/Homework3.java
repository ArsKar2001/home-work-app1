package ru.geekbrains.homeworks;

import java.util.Arrays;

public class Homework3 {
    public static void main(String[] args) {
        int[] mas = {1, 0, 1, 0, 0, 0, 0, 1, 1, 1, 1, 0, 1, 0, 1, 1, 0, 1, 1, 0, 0};

        System.out.println(Arrays.toString(mas));
        for (int i = 0; i < mas.length; i++)
            if (mas[i] == 1) mas[i] = 0;
            else mas[i] = 1;
        System.out.println(Arrays.toString(mas));
    }
}

package ru.geekbrains.homeworks;

import java.util.Arrays;

public class Homework3 {
    public static void main(String[] args) {
        int[] mas = new int[100];
        for (int i = 0; i < mas.length; i++) mas[i] = i + 1;
        System.out.println(Arrays.toString(mas));
    }
}

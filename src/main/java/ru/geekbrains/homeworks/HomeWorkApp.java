package ru.geekbrains.homeworks;

import java.util.Scanner;

/**
 * class HomeWorkApp
 */
public class HomeWorkApp {
    private static final Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
    }

    /**
     * При вызове напечатает в столбец три слова: Orange, Banana, Apple.
     */
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        System.out.print("Введите А: ");
        int a = SC.nextInt();

        System.out.print("Введите B: ");
        int b = SC.nextInt();

        System.out.println(a + b >= 0 ? "Сумма положительная" : "Сумма отрицательная");
    }

    public static void printColor() {
        System.out.print("Введиет число: ");
        int value = SC.nextInt();

        String color = value > 0
                ? value > 100
                        ? "Зеленый"
                        : "Желтый"
                : "Красный";

        System.out.println(color);
    }
}

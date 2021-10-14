package ru.geekbrains.homeworks;

import java.util.Scanner;

/**
 * class HomeWorkApp
 */
public class HomeWorkApp {
    private static final Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("checkSum(10, 20) = " + checkSum(10, 20));
        System.out.println("checkSum(5, 10) = " + checkSum(5, 10));

        checkAndPrintNumber(-50);
        checkAndPrintNumber(20);

        System.out.println("checkNumber(-40) = " + checkNumber(-40));
        System.out.println("checkNumber(60) = " + checkNumber(60));
    }

    public static boolean checkSum(int firstTerm, int secondTerm) {
        int sum = firstTerm + secondTerm;
        return (sum >= 10) && (sum <= 20);
    }

    public static void checkAndPrintNumber(int number) {
        if (number >= 0) System.out.println("Положительное");
        else System.out.println("Отрицательное");
    }

    public static boolean checkNumber(int number) {
        return number <= 0;
    }
}

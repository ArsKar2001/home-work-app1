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

        printStrByCount("( ~ - 3 -)~", 10);

        System.out.println("checkLeapYear(2016) = " + checkLeapYear(2016));
        System.out.println("checkLeapYear(2000) = " + checkLeapYear(2000));
        System.out.println("checkLeapYear(1777) = " + checkLeapYear(1777));
        System.out.println("checkLeapYear(2020) = " + checkLeapYear(2020));
        System.out.println("checkLeapYear(2021) = " + checkLeapYear(2021));
        System.out.println("checkLeapYear(2012) = " + checkLeapYear(2012));
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

    public static void printStrByCount(String str, int count) {
        for (int i = 0; i < count; i++) System.out.println(str);
    }

    public static boolean checkLeapYear(int year) {
        if (year % 4 != 0) return false;
        else if (year % 100 == 0)
            return year % 400 == 0;
        return true;
    }
}

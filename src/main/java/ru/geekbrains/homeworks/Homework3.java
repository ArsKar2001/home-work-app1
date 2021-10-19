package ru.geekbrains.homeworks;

public class Homework3 {
    public static void main(String[] args) {
        int[] arr1 = {2, 2, 2, 1, 2, 2, 10, 1};
        int[] arr2 = {1, 1, 1, 2, 1};
        int[] arr3 = {1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2};
        int[] arr4 = {4, 5, 6, 7, 2, 34, 2, 3};

        System.out.println("checkBalance(arr1) = " + checkBalance(arr1));
        System.out.println("checkBalance(arr2) = " + checkBalance(arr2));
        System.out.println("checkBalance(arr3) = " + checkBalance(arr3));
        System.out.println("checkBalance(arr4) = " + checkBalance(arr4));
    }

    public static boolean checkBalance(int[] arr) {
        if (arr.length > 0) {
            int leftSum = arr[0];
            int rightSum = arr[arr.length - 1];
            for (int i = 1, j = arr.length - 2; i < arr.length || j >= 0; ) {
                if (leftSum < rightSum) {
                    leftSum += arr[i];
                    i++;
                    continue;
                }
                if (leftSum > rightSum) {
                    rightSum += arr[j];
                    j--;
                    continue;
                }
                if (Math.abs(i - j) != 1) {
                    leftSum += arr[i];
                    rightSum += arr[j];
                    i++;
                    j--;
                } else return true;
            }
        }
        return false;
    }
}

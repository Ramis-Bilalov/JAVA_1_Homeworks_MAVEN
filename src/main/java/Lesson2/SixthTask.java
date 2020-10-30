package Lesson2;

// 6. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
// метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой
// части массива равны. Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true,
// checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы в массив не входят.

import java.util.Arrays;

public class SixthTask {
    public static void main(String[] args) {
        int[] a = new int[10];
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = (int)(Math.random() * 5);
            sum = sum + a[i];
        }
        boolean b = checkTheSymmetry(a, sum);
        System.out.println(b);
    }

    private static boolean checkTheSymmetry(int[] a, int sum) {
        long sum1 = 0;
        for (int i = 0; i < a.length; i++) {
            sum1 = sum1 + a[i];
            if(sum1 * 2 == sum) {
                printArrayInfo(a, i);
                return true;
            }
        } return false;
    }

    private static void printArrayInfo(int[] a, int pos) {
        for (int i = 0; i <= pos ; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.print("| ");
        for (int i = pos + 1; i < a.length ; i++) {
            System.out.print(a[i] + " ");
        }
    }
}

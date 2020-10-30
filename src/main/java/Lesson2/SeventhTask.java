package Lesson2;

// 7. **** Написать метод, которому на вход подается одномерный
// массив и число n (может быть положительным, или отрицательным),
// при этом метод должен сместить все элементы массива на n позиций.
// Для усложнения задачи нельзя пользоваться вспомогательными массивами.

import java.util.Arrays;

public class SeventhTask {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] res = shift(a, 3);
        System.out.println(Arrays.toString(res));
    }

    private static int[] shift(int[] array, int n) {
        int shift = (array.length + n) % array.length;
        for (int i = 0; i < shift; i++) {
            makeShift(array);
        }
        return array;
    }

    private static void makeShift(int[] array) {
        int left = array[0];
        for (int i = 0; i < array.length-1; i++) {
            array[i] = array[i+1];
        }
        array[array.length - 1] = left;
    }
}
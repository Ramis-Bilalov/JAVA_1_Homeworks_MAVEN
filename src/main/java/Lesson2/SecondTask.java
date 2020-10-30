package Lesson2;

import java.util.Arrays;

// 2. Задать пустой целочисленный массив размером 8.
// С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;

public class SecondTask {
    public static void main(String[] args) {
        int[] a = new int[8];
        int n = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = n;
            n+=3;
        } System.out.println(Arrays.toString(a) + " ");
    }
}

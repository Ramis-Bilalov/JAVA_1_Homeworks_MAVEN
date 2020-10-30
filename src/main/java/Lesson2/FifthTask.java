package Lesson2;

// 5. ** Задать одномерный массив и найти в нем минимальный
// и максимальный элементы (без помощи интернета);

import java.util.Arrays;

public class FifthTask {
    public static void main(String[] args) {
        int[] a = new int[10];
        for(int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100);
        }
        System.out.println("Рандомный массив: " + Arrays.toString(a));
        int max = -1, min = 1000;
        for(int element: a) {
            if(element > max) {
                max = element;
            }
            if(element < min) {
                min = element;
            }
        }
        System.out.println("Максимум из массива: " + max + "\nМинимум из массива: " + min);
    }
}
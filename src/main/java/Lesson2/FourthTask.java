package Lesson2;

// 4. Создать квадратный двумерный целочисленный массив
// (количество строк и столбцов одинаковое), и с помощью
// цикла(-ов) заполнить его диагональные элементы единицами;

public class FourthTask {
    public static void main(String[] args) {
        int[][] a = new int[9][9];
        for (int i = 0, j = 0; i < a.length; i++, j++) {
            if(i == j) {
                a[i][j] = 1;
            }
        }
        for (int i = a.length-1, j = 0; i >= 0; i--, j++) {
            a[i][j] = 1;
        }
        for (int i = 0; i < a.length ; i++) {
            System.out.print("\n");
            for (int j = 0; j < a[i].length ; j++) {
                System.out.print(a[i][j] + " ");
            }
        }
    }
}

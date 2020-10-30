package Lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class XOSelf {
    private static int SIZE;
    private static final char USER = 'X';
    private static final char PC = 'O';
    private static char[][] MAP;
    private static final char DEFAULT = '_';
    private static boolean isInGame;


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        fillMap(3);
        printMap();
        int counter = 0;
        System.out.println("Игра крестики-нолики\nВы играете за X\nДля того, чтобы " +
                "совершить ход: введите номер строки и номер стобца");
        while(isInGame) {
            System.out.println("Ваш ход:");
            int x, y;
            try {
                x = in.nextInt();
                y = in.nextInt();
            } catch(Exception e) {
                System.out.println("Введите корректные данные");
                in.nextLine();
                continue;
            }
            x--;
            y--;
            if(move(x, y, USER)) {
                printMap();
                if(case1(USER, SIZE)) {
                    System.out.println("Вы победили");
                    break;
                }
                try {
                    System.out.println("Ходит компьютер");
                    moveAI();
                    printMap();
                } catch(Exception e) {
                    System.out.println("Ничья");
                    break;
                }
                if(case1(PC, SIZE)) {
                    System.out.println("Вы проиграли");
                    break;
                }
            } else {
                System.out.println("Введите корректные данные");
            }
        }

    }

    private static boolean case1(char user, int size) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if(MAP[0][0] == user && MAP[0][1] == user && MAP[0][2] == user)
                    return true;
                if(MAP[1][0] == user && MAP[1][1] == user && MAP[1][2] == user)
                    return true;
                if(MAP[2][0] == user && MAP[2][1] == user && MAP[2][2] == user)
                    return true;
                if(MAP[0][0] == user && MAP[1][0] == user && MAP[2][0] == user)
                    return true;
                if(MAP[0][1] == user && MAP[1][1] == user && MAP[2][1] == user)
                    return true;
                if(MAP[0][2] == user && MAP[1][2] == user && MAP[2][2] == user)
                    return true;
                if(MAP[2][0] == user && MAP[1][1] == user && MAP[0][2] == user)
                    return true;
                if(MAP[0][0] == user && MAP[1][1] == user && MAP[2][2] == user)
                    return true;
            }
        } return false;
    }

    private static void moveAI() {
        int a = 0;

        int i = 0;
        int j = 0;
        while(MAP[i][j] != DEFAULT) {
            i = (int) (a + Math.random() * 2);
            j = (int) (a + Math.random() * 2);
        }
        MAP[i][j] = PC;

        //throw new IllegalArgumentException();
    }




    private static void fillMap(int size) {
        isInGame = true;
        SIZE = size;
        MAP = new char[size][size];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                MAP[i][j] = DEFAULT;
            }
        }
    }

    private static void printMap() {
        System.out.print("  ");
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + "|");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(MAP[i][j] + "|");
            }
            System.out.println();
        }
    }

    static boolean move(int x, int y, char player) {
        try {
            if (MAP[x][y] == DEFAULT) {
                MAP[x][y] = USER;
                return true;
            } else {
                return false;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            return false;
        }
    }
}

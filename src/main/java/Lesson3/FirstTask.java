package Lesson3;

// 1. Написать программу, которая загадывает случайное число от 0 до 9 и
// пользователю дается 3 попытки угадать это число. При каждой попытке
// компьютер должен сообщить, больше ли указанное пользователем число,
// чем загаданное, или меньше. После победы или проигрыша выводится запрос –
// «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).

import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        guessRiddle(input);
    }

    public static void guessRiddle(Scanner input) {
        int randomNumber = (int) (Math.random() * 10);
        int attempts = 0;
        int res = 0;
        while(attempts < 3) {
            System.out.print("Введите число от 0 до 10: ");
            int result = input.nextInt();
            if (result == randomNumber) {
                System.out.print("\n***Поздравляю!!! Вы угадали!!!\nПовторить игру еще раз? 1 – повторить, 0 – нет ");
                res = input.nextInt();
                if(res == 1) {
                    randomNumber = (int) (Math.random() * 10);
                    System.out.println("\n-Новая игра-");
                    attempts = 0;
                    continue;
                }
                break;
            }
            if (result > randomNumber) {
                System.out.println("Попытка №" + (attempts+1) + "\n---Введенное число больше загаданного..." +
                        "\n---Повторите еще раз!");
                attempts++;
            }
            if (result < randomNumber) {
                System.out.println("\nПопытка №" + (attempts+1) + "\n---Введенное число меньше загаданного..." +
                        "\n---Повторите еще раз!");
                attempts++;
            }
            if (attempts == 3) {
                System.out.print("\n***Ответ неверный! Верный ответ был:" + randomNumber + "" +
                        "\nПовторить игру еще раз? 1 – повторить, 0 – нет ");
                res = input.nextInt();
                if (res == 1) {
                    randomNumber = (int) (Math.random() * 10);
                    System.out.println("\n-Новая игра-");
                    attempts = 0;
                    continue;
                } break;
            }
        }
    }
}

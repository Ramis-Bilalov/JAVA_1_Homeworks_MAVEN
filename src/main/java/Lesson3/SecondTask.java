package Lesson3;

// 2. Создать массив из слов
//String[] words = {"apple", "orange", "lemon", "banana", "apricot",
// "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon",
// "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
// "pear", "pepper", "pineapple", "pumpkin", "potato"}.
//При запуске программы компьютер загадывает слово, запрашивает ответ
// у пользователя, сравнивает его с загаданным словом и сообщает, правильно
// ли ответил пользователь. Если слово не угадано, компьютер показывает буквы,
// которые стоят на своих местах.
//apple – загаданное
//apricot - ответ игрока
//ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
//Для сравнения двух слов посимвольно можно пользоваться:
//String str = "apple";
//char a = str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
//Играем до тех пор, пока игрок не отгадает слово.
//Используем только маленькие буквы.

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {"apple", "orange", "lemon", "banana",
                "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango",
                "mushroom", "nut", "olive", "pea", "peanut", "pear",
                "pepper", "pineapple", "pumpkin", "potato"};
        int res = (int) (Math.random() * 0 + Math.random() * (words.length - 1));
        String compAnswer = words[res];
        System.out.println("Ответ для теста: " + compAnswer);
        String userAnswer = input.nextLine();

        int latticeNum = 0;
        char lattice = '#';


        while(true) {
            int number = compareWordInput(compAnswer, userAnswer.toLowerCase(), latticeNum);
            if (number == compAnswer.length()) {
                System.out.println("Поздравляю. Вы угадали!");
                break;
            }
            else if(number > 0) {
                createLattices(number, compAnswer, lattice);
                userAnswer = input.next();

            }
            else {
                System.out.println("Неправильное слово или не совпадает первая буква!");
                userAnswer = input.next();
            }
        }
    }

    private static void createLattices(int number, String compAnswer, char lattice) {
        for (int i = 0; i < number; i++) {
            System.out.print(compAnswer.charAt(i));
        }
        for (int i = 0; i < 15-number; i++) {
            System.out.print(lattice);
        }
    }

    private static int compareWordInput(String compAnswer, String userAnswer, int latticeNum) {
        for (int i = 0; i < compAnswer.length() && i < userAnswer.length(); i++) {
            char compWord = compAnswer.charAt(i);
            char userWord = userAnswer.charAt(i);
            if(compAnswer.charAt(0) == userAnswer.charAt(0)) {
                if (compWord == userWord) {
                    latticeNum++;
                }
            }
        } return latticeNum;
    }
}


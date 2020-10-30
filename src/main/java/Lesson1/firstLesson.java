package Lesson1;

public class firstLesson {
    public static void main(String[] args) {    // 1. задание
        byte b = 120;                           // 2. задание
        short s = 32000;
        int i = 1000000;
        long l = 200000L;
        float f = 14.98f;
        double d = 19.55;
        char c = 'y';
        boolean bl = true;

        int solve = result(4,5,6,3);                    // 3. задание
        System.out.println("Результат выражения = " + solve);

        boolean resultOfCheck = check(10,15);                // 4. задание
        System.out.println("Результат проверки = " + resultOfCheck);

        checkPstvNgtv(15);                                      // 5. задание

        boolean resCheckNgtv = checkNgtv(-5);
        System.out.println("Результат проверки(число отрицательно или нет) = " + resCheckNgtv);     // 6. задание

        hiMan("Michel");            // 7. задание

        leapYear(1300);                   // 8.  заданиее




    }

    public static int result(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    public static boolean check(int a, int b) {
        int sum = a + b;
        if(sum >= 10 && sum <=20)
            return true;

        return false;
    }

    public static void checkPstvNgtv(int a) {
        if(a >= 0) System.out.println(a + " - положительное число");
        else System.out.println(a + " - отрицательное число");
    }

    public static boolean checkNgtv(int a) {
        if(a < 0) return true;
        return false;
    }

    public static void hiMan(String name) {
        System.out.println("Привет " + name);
    }

    public static void leapYear(int year) {
        int res1 = year % 4;
        int res2 = year % 100;
        int res3 = year % 400;
        if((res1 == 0 && res2 != 0)  || res3 == 0)
            System.out.println("Год високосный");
        else System.out.println("Год НЕ високосный");
    }
}

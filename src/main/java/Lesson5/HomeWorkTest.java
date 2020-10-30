package Lesson5;

public class HomeWorkTest {
    public static void main(String[] args) {

        Person[] personArray = new Person[5];

        personArray[0] = new Person("Ivan Sergev", "Engineer", "sergeev@mail.ru", "8(917)002-56-78", 40000, 30);
        personArray[1] = new Person("Sergey Ivanov", "Scientist", "ivanov@mail.ru", "8(987)111-55-15", 45000, 45);
        personArray[2] = new Person("Dima Sidorov", "Dentist", "sidorov@mail.ru", "8(927)335-98-77", 60000, 50);
        personArray[3] = new Person("Petr Kolesnikov", "Driver", "kolesnikov@mail.ru", "8(999)145-65-97", 45000, 52);
        personArray[4] = new Person("Oleg Morozov", "Teacher", "morozov@mail.ru", "8(965)666-67-19", 50000, 60);

        for (int i = 0; i < personArray.length; i++) {
            Person param = personArray[i];
            param.ageCheck(40);
        }
    }
}
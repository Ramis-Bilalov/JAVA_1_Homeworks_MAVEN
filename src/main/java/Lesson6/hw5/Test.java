package Lesson6.hw5;

import Lesson6.hw5.Person;

public class Test {
    public static void main(String[] args) {
        Person person = Person.builder()
                .withAge(12)
                .withEmail("ramiska81@gmail.com")
                .withPhone("89963360516")
                .withSalary(100500)
                .withName("Ivan")
                .withSurname("Ivanov")
                .withPosition("developer")
                .build();
        System.out.println(person);
    }
}

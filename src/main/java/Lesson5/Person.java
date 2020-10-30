package Lesson5;

public class Person {
    private final String name;
    private final String profession;
    private final String eMail;
    private final String telNum;
    private final int salary;
    private final int age;

    public Person(String name, String profession, String eMail, String telNum, int salary, int age) {
        this.name = name;
        this.profession = profession;
        this.eMail = eMail;
        this.telNum = telNum;
        this.salary = salary;
        this.age = age;
    }

    public void personInfo() {
        System.out.println("Full name: " + name + "\nProfession: " + profession + "\nE-mail: " + eMail +
                "\nTelephone: " + telNum + "\nSalary: " + salary +"\nВозраст: "+ age + " year");
        System.out.println();
    }

    public void ageCheck(int num) {
        if(age > num) {
            personInfo();
        }
    }
}
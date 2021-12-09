package az.iktlab.juniors.java_lessons.lesson_8;

public class Person {

    public String name;
    public String surname;
    public int age;

    public Person() {
        System.out.println("Default constructor");
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
}

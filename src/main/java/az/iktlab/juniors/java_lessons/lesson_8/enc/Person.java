package az.iktlab.juniors.java_lessons.lesson_8.enc;

public class Person {

    public String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0)
            System.out.println("Age can not be negative");
        else this.age = age;
    }
}

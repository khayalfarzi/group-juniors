package az.iktlab.juniors.java_lessons.lesson_10;

public class Student implements Ability {

    @Override
    public void write() {
        System.out.println("Student write method");
    }

    @Override
    public void read() {
        System.out.println("Student read method");
    }
}

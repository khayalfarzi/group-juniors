package az.iktlab.juniors.java_lessons.lesson_10;

public class Teacher implements Ability {

    @Override
    public void write() {
        System.out.println("Teacher write method");
    }

    @Override
    public void read() {
        System.out.println("Teacher read method");
    }

    public void run() {
        System.out.println("Sec method");
    }
}

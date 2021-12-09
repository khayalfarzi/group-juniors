package az.iktlab.juniors.java_lessons.lesson_8.enc;

public class Main {

    public static void main(String[] args) {

        Person p = new Person();
        p.name = "X";
//        p.age = 23;
        System.out.println(p);

        Person p1 = new Person();
        p1.name = "Y";
//        p1.age = -23;
        System.out.println(p1);

        Person p2 = new Person();
        p2.setAge(-23);
        System.out.println(p2.getAge());
    }
}

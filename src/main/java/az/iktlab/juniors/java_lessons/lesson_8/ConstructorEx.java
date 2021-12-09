package az.iktlab.juniors.java_lessons.lesson_8;

public class ConstructorEx {

    public static void main(String[] args) {

//        Person p = new Person();

        Person p1 = new Person(12);
        System.out.println(p1.age);

        Person p3 = new Person("Parvin", "Etibarli", 322);
        System.out.println(p3.hashCode()); //1b6d3586
    }
}

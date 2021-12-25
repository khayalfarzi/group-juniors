package az.iktlab.juniors.java_lessons.lesson_12;

public class Main {

    public static void main(String[] args) {

//        Human human = new Human();
//        human.setName("");
//        System.out.println(human);

        Person p = new Person();
        p.setName(" P ");
        System.out.println(p);

        I i = new Person();
        i.write();

        System.out.println(Gender.MALE);
        System.out.println(Gender.FEMALE);

        for (Gender gender : Gender.values())
            System.out.println(gender.getVal());

    }
}

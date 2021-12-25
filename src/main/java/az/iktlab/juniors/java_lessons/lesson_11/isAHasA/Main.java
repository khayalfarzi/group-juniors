package az.iktlab.juniors.java_lessons.lesson_11.isAHasA;

public class Main {
    public static void main(String[] args) {

        Engineer engineer = new Engineer();
        engineer.setName("E 1");

        System.out.println(engineer);

        Human human = new Human();
        human.setName("E 2");
        human.setAge("23");
        Engineer engineer1 = new Engineer();
        engineer1.setHuman(human);
//        engineer1.getHuman().setName();

        System.out.println(engineer1);
    }
}

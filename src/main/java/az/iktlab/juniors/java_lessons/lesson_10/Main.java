package az.iktlab.juniors.java_lessons.lesson_10;

public class Main {

    public static void main(String[] args) {

//        Teacher teacher = new Teacher();
//
//        teacher.write();
//        teacher.read();
//
//        Student student = new Student();
//        student.write();
//        student.read();

        Ability human =(Teacher) new Teacher();
        human.write();
        human.read();
        ((Teacher)human).run();

        human = new Student();
        human.write();
        human.read();
    }
}

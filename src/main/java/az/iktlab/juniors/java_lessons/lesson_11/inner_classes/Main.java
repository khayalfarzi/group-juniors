package az.iktlab.juniors.java_lessons.lesson_11.inner_classes;

public class Main {

    public static void main(String[] args) {

//        Person person1 =new Person();
//        person1=new Person().Gender

        Person person = new Person("A 1", 23,
                new Person.Gender());
    }
}

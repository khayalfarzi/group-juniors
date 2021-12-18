package az.iktlab.juniors.java_lessons.lesson_10;

public class MySql implements Sql{

    @Override
    public  void connect(){
        System.out.println("Mysql connect");
    }
}

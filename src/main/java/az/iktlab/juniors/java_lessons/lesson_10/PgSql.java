package az.iktlab.juniors.java_lessons.lesson_10;

public class PgSql implements Sql{

    @Override
    public  void connect(){
        System.out.println("Pgsql connect");
    }
}

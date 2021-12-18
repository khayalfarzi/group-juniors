package az.iktlab.juniors.java_lessons.lesson_10;

public class SqlApp {

    public static void main(String[] args) {

//        MySql mySql = new MySql();
//        mySql.connect();
//
//        PgSql pgSql = new PgSql();
//        pgSql.connect();
        Sql sql = new PgSql();
        sql.connect();
    }
}

package az.iktlab.juniors.java_lessons.lesson_21;

import java.sql.*;

public class JdbcConnector {

    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/group_juniors";
        String user = "postgres";
        String pass = "root";
        try {
            Connection connection = DriverManager.getConnection(url, user, pass);
            Statement stmt = connection.createStatement();

            String query = "insert into person (name, age) VALUES ('Shahriyar', 9);";
            String delete = "delete from person where id = 6";
            String select = "select * from person";

//            boolean isSuccess = stmt.execute(query);
//            System.out.println(stmt.executeUpdate(query));
//            System.out.println(isSuccess);

            boolean isSuccess = stmt.execute(select);

//            System.out.println(isSuccess);

            ResultSet rs = stmt.getResultSet();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");

                System.out.printf("[%s , %s , %s]\n", id, name, age);
            }

            String table = "create table juniors (" +
                    "id bigserial primary key, " +
                    "name varchar NOT NULL, " +
                    "surname varchar ," +
                    "birth_date date NOT NULL" +
                    ")";

            System.out.println(stmt.execute(table));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
package az.iktlab.juniors.java_lessons.lesson_13;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateEx {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.MIN;
        LocalDate localDate1 = LocalDate.MAX;
        LocalDate localDate2 = LocalDate.now();

//        System.out.println(localDate);
//        System.out.println(localDate1);
//        System.out.println(localDate2);

        System.out.println(localDate2);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
        System.out.println(localDate2.format(formatter));
    }
}

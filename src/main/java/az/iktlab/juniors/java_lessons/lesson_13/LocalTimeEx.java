package az.iktlab.juniors.java_lessons.lesson_13;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeEx {

    public static void main(String[] args) {
        LocalTime localTime = LocalTime.MAX;
        System.out.println(localTime);

        LocalTime localTime1 = LocalTime.now();
        System.out.println(localTime1);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH/mm/ss");
        System.out.println(localTime1.format(formatter));
    }
}

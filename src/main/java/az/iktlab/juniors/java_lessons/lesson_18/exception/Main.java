package az.iktlab.juniors.java_lessons.lesson_18.exception;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        Person person = null;

        try {
//            System.out.println("Try block");
//            System.out.println(person.getId());
//            throw new  IOException();
            int a = 5 / 0;
        } catch (RuntimeException e) {
            if (e instanceof ArithmeticException)
                System.out.println(e.getMessage());
            else if (e instanceof NullPointerException)
                System.out.println(e.getMessage());
            else System.out.println("Bilinmeyen xeta bas verdi");
        } finally {
            System.out.println("End");
        }
    }
}

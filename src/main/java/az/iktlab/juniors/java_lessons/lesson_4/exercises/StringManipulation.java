package az.iktlab.juniors.java_lessons.lesson_4.exercises;

import java.util.Scanner;

public class StringManipulation {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String word = sc.next();
        String lastElement = String.valueOf(word.charAt(word.length() - 1));
        String response = String.format("%s%s%s", lastElement, word, lastElement);

        System.out.println(response);
    }
}

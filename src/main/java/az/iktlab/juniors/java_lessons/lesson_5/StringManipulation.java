package az.iktlab.juniors.java_lessons.lesson_5;

import java.util.Scanner;

public class StringManipulation {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String word = sc.next();

        word = word2XX(word);

        System.out.println(word);
    }

    public static String word2XX(String word) {
        return word.replace("x", "");
    }

    public static String wordX2(String word) {
        // xxHxix
        //   H i
        // H i
        // Hxi
        return word.replace("x", " ").trim().replace(" ", "x");
    }
}

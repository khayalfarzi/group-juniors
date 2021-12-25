package az.iktlab.juniors.java_lessons.lesson_13;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {

    public static void main(String[] args) {
        String word = "Hello : world : Hello";
        String[] arr = word.split(":");
        System.out.println(Arrays.toString(arr));

        Pattern pattern = Pattern.compile("IktLab", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Welcome to the Java group Juniors Iktlab");

        boolean isExist = matcher.find();

        if (isExist)
            System.out.println("Match found");
        else System.out.println("Match not found");
    }
}

package az.iktlab.juniors.java_lessons.lesson_7;

import java.util.Random;

public class FindPeopleCountEx {


    public static void main(String[] args) {

        int[] people = fillRndArr();
        // write your code here...
    }

    private static int[] fillRndArr() {
        int[] people = new int[10_000_000];
        Random rnd = new Random();
        for (int i = 0; i < 10_000_000; i++) {
            people[i] = rnd.nextInt(150);
        }
        return people;
    }
}

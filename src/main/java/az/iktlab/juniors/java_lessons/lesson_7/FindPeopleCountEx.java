package az.iktlab.juniors.java_lessons.lesson_7;

import java.util.Random;

public class FindPeopleCountEx {


    public static void main(String[] args) {
        int[] people = fillRndArr();
        int[] ages = splitAges(people);
        printAges(ages);
    }

    private static void printAges(int[] ages) {
        for (int i = 0; i < ages.length; i++)
            System.out.printf("%s => %s \n", i, ages[i]);
    }

    private static int[] splitAges(int[] people) {
        int[] ages = new int[150];
        for (int person : people) {
            ages[person]++;
        }
        return ages;
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

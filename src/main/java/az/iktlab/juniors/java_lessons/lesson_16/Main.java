package az.iktlab.juniors.java_lessons.lesson_16;

import java.util.List;
import java.util.Scanner;

public class Main {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        List<Person> people = Loader.load();

        System.out.print("Enter id: ");

        int id = sc.nextInt();

        for (Person person : people) {
            if (person.getId() == id) {
                System.out.println(person);
                break;
            }
        }
    }
}

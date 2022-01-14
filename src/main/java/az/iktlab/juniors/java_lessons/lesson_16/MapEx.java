package az.iktlab.juniors.java_lessons.lesson_16;

import java.util.*;

public class MapEx {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 2); // [1-2]
        map.put(1, 3);//  [1-3]

        System.out.println(map);

        int id = sc.nextInt();

        Map<Integer, Person> people = Loader.loadMap();

//        System.out.println(people);

        System.out.println(people.get(id));
    }
}

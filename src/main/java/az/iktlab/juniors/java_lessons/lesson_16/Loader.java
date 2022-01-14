package az.iktlab.juniors.java_lessons.lesson_16;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class Loader {

    public static List<Person> load() {
        return asList(
                new Person(23, "N1", "SN1"),
                new Person(98, "N2", "SN2"),
                new Person(34, "N3", "SN3"));
    }

    public static Map<Integer, Person> loadMap() {
        Map<Integer, Person> map = new HashMap<>();

        for (Person person : load())
            map.put(person.getId(), person);

        return map;
    }
}

package az.iktlab.juniors.java_lessons.lesson_14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InnerList {

    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(Arrays.asList(1, 6, 8));
        list.add(Arrays.asList(1, 6, 8));
        list.add(Arrays.asList(1, 6, 8));

        System.out.println(list);

        list.remove(0);

        System.out.println(list);

        list.get(0).remove(1);
        System.out.println(list);
    }
}

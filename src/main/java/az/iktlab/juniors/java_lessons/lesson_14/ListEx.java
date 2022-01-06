package az.iktlab.juniors.java_lessons.lesson_14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListEx {

    public static void main(String[] args) {

//        ArrayList list = new ArrayList();
//
//        list.add(1);
//        list.add("12");
//        list.add('A');
//
//        System.out.println(list);
//
//        List<Integer> list1 = new ArrayList<>();
//        list1.add(1);
//        list1.add(2);
//        System.out.println(list1);
//
//        GenericEx<String> stringGenericEx = new GenericEx<>(1);
//        stringGenericEx.genEx("sdfg");
//
//        GenericEx<Character> characterGenericEx = new GenericEx<>(3);
//        characterGenericEx.genEx('X');

//        List<Integer> list2 = new ArrayList<>();
//        list2.add(1);
//        list2.add(2);
////        System.out.println(list2);
////
////        System.out.println(list2.get(0));
//
//        list2.set(1, 78);
//        list2.remove(0);
//        System.out.println(list2);

        List<Integer> list3 = Arrays.asList(1, 3, 6, 8);
//        list3.add(9);
        list3.remove(0);
        System.out.println(list3);

        Iterable<Integer> iterable = list3;
        Iterator<Integer> iterator = iterable.iterator();

        while (iterator.hasNext())
            System.out.println(iterator.next());
    }
}

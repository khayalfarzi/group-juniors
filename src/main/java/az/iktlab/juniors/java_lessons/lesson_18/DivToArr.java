package az.iktlab.juniors.java_lessons.lesson_18;

import java.util.Arrays;

public class DivToArr {

    public static void main(String[] args) {
        int num = 564;
        String strnum = String.valueOf(num);
        String[] arr = strnum.split("");
        System.out.println(Arrays.toString(arr));

    }
}

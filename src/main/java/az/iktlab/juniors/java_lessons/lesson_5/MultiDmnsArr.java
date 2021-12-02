package az.iktlab.juniors.java_lessons.lesson_5;

import java.util.Arrays;

public class MultiDmnsArr {

    public static void main(String[] args) {

        int[][] arr = {{1, 2, 3}, {}, {2, 5, 6, 9, 8}, {1}};

//        System.out.println(arr[1][0]);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
//        System.out.println(Arrays.toString(arr));

//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j]);
//            }
//            System.out.println();
//        }
    }
}

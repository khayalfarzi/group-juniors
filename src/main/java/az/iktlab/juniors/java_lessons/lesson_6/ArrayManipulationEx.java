package az.iktlab.juniors.java_lessons.lesson_6;

public class ArrayManipulationEx {

    public static int[] findMaxAndMin(int[] arr) {
        int min = Integer.MAX_VALUE; // 999999
        int max = Integer.MIN_VALUE; // -9999999
// 1, 4, 7, 8, 9, 0, 3, 5
        for (int i : arr) {
            if (max < i)
                max = i;
            if (min > i)
                min = i;
        }
        return new int[]{min, max};
    }

    public static int[] findMaxAndMin2(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i])
                max = arr[i];
            if (min > arr[i])
                min = arr[i];
        }
        return new int[]{min, max};
    }
}

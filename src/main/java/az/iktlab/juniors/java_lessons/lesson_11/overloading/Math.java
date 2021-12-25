package az.iktlab.juniors.java_lessons.lesson_11.overloading;

public class Math {

    public static int sum(int first, int second) {
        return first + second;
    }

    public static double sum(double first, double second) {
        return first + second;
    }

    public static int sum(int first, int second, int third) {
        return first + second + third;
    }
}

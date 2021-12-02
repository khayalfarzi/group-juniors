package az.iktlab.juniors.java_lessons.lesson_6;

public class MethodEx {

    public static void main(String[] args) {
        double sqr = m4(5);
        System.out.println(sqr);
    }

    public static void m1() {
        System.out.println("Method 1");
    }

    public static void m2(int num) {
        System.out.println(num);
    }

    public static double m3() {
        return 5.6;
    }

    public static double m4(double num) {
        return num * num;
    }

    public static void m5(int a, int b, int[] arr) {
    }
}
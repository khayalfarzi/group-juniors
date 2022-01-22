package az.iktlab.juniors.java_lessons.lesson_18;

interface StringFunction {
    String run(String str);
}

interface MathFunction {
    int run(int first, int second);
}

public class Main {
    public static void main(String[] args) {

        MathFunction func = (i, j) -> i * j;
        calculate(5, func);
    }

    public static void calculate(double d, MathFunction func) {
        int result = func.run((int) d * 2, (int) ((int) d * d)); // 10, 25
        System.out.println(result);
    }
    public static void printFormatted(String str, StringFunction format) {
        String result = format.run(str); //Hello+! => Hello!
        System.out.println(result);
    }

}
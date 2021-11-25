package az.iktlab.juniors.java_lessons.lesson_4;

public class StringEx {

    public static void main(String[] args) {
        String apple = "Apple";
        System.out.println(apple);

        // StringBuilder
        // StringBuffer

        String str = "num 1";
        str = "num 2";

        StringBuilder sb = new StringBuilder("num 2");
        sb.append(" num 1");

        System.out.println(str); // num 2
        System.out.println(sb); // num 2 num 1
    }
}

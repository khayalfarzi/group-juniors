package az.iktlab.juniors.java_lessons.lesson_3.lesson;

public class TernaryOp {

    public static void main(String[] args) {

        int a = 5;
        String s1 = "";
        if (a >= 0)
            s1 = "Musbet";
        else s1 = "Menfi";

        System.out.println(s1);

        // Tern
        String s = a >= 0 ? "Musbet" : "Menfi";
        System.out.println(s);
    }

}

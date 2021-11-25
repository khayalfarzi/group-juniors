package az.iktlab.juniors.java_lessons.lesson_4;

public class LoopsEx {

    public static void main(String[] args) {

        OUTTER_FOR:
        for (int i = 0; i < 10; i++) {
            INNER_FOR:
            for (int j = 0; j < 10; j++) {
                System.out.println(j);
                break OUTTER_FOR;
            }
        }
    }
}

package az.iktlab.juniors.java_lessons.lesson_14;

public class GenericEx<T> {

    public GenericEx(int i) {
        System.out.println(i);
    }

    public void genEx(T t) {
        System.out.println(t);
    }
}

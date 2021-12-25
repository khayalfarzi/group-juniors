package az.iktlab.juniors.java_lessons.lesson_13;

public class PandW {

    public static void main(String[] args) {

//        int a = 5;
//        System.out.println(a);
//
//        Integer aa = new Integer(5);
//        System.out.println(aa);
//
//        String num = "5";
//        Integer numInt = Integer.parseInt(num);
//        System.out.println(numInt + 1);
//
//        Integer intVal= Integer.valueOf("78");

        Integer i = new Integer(126);
        System.out.println(i);

        Integer i1 = new Integer(128);
        System.out.println(i1);

        Integer i2 = Integer.valueOf(128);
        System.out.println(i2);

        int i3 = 128;

        System.out.println(i1 == i3);

        Integer i4 = i3; // Boxing

        int i5 = i4; // UnBoxing
    }
}

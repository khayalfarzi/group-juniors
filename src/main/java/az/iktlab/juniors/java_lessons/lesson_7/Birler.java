package az.iktlab.juniors.java_lessons.lesson_7;

import java.util.Scanner;

public class Birler {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        int x2;
        int say = 0;
        int i = 0;
       {
            do {
                x2 = x % 2;  // qaliq
                x = x / 2; // tam
                if (x2 == 1) say = say + 1;
                System.out.println(+x + "   " + x2);
                i++;
            } while (x >= 1);
        }
        System.out.println(say);
    }
}

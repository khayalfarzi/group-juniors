package az.iktlab.juniors.java_lessons.lesson_7;

import java.util.Scanner;

public class Timinsodabutulkalari {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        int x=0;
        int i = 0;

            do {

                a = a + b - c + 1;
                x = x + 1;

                i++;
            } while (a <= 2);


        System.out.println(x);
    }
}

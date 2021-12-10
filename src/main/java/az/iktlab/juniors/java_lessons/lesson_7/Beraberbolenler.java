package az.iktlab.juniors.java_lessons.lesson_7;

import java.util.Scanner;

public class Beraberbolenler {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x = sc.nextInt();
        int n;
        int n1;
        int a=0;
        for (int i = 1; i < x; i++) {
            n=x/i;
            n1=x%i;
            if(n==n1) {
                a=a+1;
            }
        }
        System.out.println(a);
    }
}

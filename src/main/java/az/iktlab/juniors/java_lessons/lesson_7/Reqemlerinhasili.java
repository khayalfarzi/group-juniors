package az.iktlab.juniors.java_lessons.lesson_7;

import java.util.Scanner;

public class Reqemlerinhasili {
    public static void main(String[] args) {
        Scanner sc= new  Scanner(System.in);
        int num= sc.nextInt();
        int first=num/100;
        int avarage= (num%100)/10;
        int last=num%10;
        System.out.println(first*avarage*last);
    }
}

package az.iktlab.juniors.java_lessons.lesson_7;

import java.util.Scanner;

public class Saitler {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       String cumle= sc.nextLine();
int n=0;
        String saitler[] = new String[]{"A", "E", "Y", "O", "U", "I"};
        for (int i = 0; i < cumle.length(); i++) {
    //    String ne =    cumle.toCharArray();
        if(cumle.equalsIgnoreCase(String.valueOf(saitler)) ) {
            n=n+1;
        }
    }
        System.out.println(n);
} }

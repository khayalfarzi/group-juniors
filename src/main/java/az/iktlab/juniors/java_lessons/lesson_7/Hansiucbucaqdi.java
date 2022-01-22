package az.iktlab.juniors.java_lessons.lesson_7;

import java.util.Scanner;

public class Hansiucbucaqdi {
    public static void main(String[] args) {
        //Tək sətirdə üçbucaq bərabərtərəflidirsə - 1, bərabəryanlıdırsa - 2, müxtəliftərəflidirsə - 3 verməli.
        Scanner sc = new Scanner(System.in);
        int n1= sc.nextInt();
        int n2= sc.nextInt();
        int n3= sc.nextInt();
        if(n1==n2 && n2==n3) System.out.println("1");
        else if(n1==n2 || n2==n3 || n1==n3) System.out.println("2");
        else System.out.println("3");
    }
}

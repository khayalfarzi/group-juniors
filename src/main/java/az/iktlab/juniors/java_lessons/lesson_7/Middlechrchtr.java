package az.iktlab.juniors.java_lessons.lesson_7;

import java.util.Scanner;

public class Middlechrchtr {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    String x= sc.next();
        System.out.println(Chrctr(String.valueOf(x)));
        
    }
    private static String Chrctr(String x) {

        int a = x.length();
        int odd = a / 2;
        int even = (a / 2) - 1;
        if (a % 2 == 0)
            return x.charAt(odd) +" "+ x.charAt(even) ;
        else {
         return String.valueOf(x.charAt(odd));
            
        }

       
    }
}

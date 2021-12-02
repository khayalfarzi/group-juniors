package az.iktlab.juniors.java_lessons.lesson_6;

import java.util.Scanner;

public class Factorialex {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter the number : ");
        int num = sc.nextInt();

//        System.out.println(calcFac(3));

        System.out.println(calcFacR(num));
    }

    public static int calcFac(int digit) {
        int result = 1;
        for (int i = 1; i <= digit; i++) {
            result = result * i;
        }
        return result;
    }

    public static int calcFacR(int digit) {
        return digit == 0 ? 1 : digit * calcFacR(digit - 1);
    }
}

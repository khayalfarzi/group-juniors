package az.iktlab.juniors.java_lessons.lesson_7;

import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {

                Scanner in = new Scanner(System.in);
                System.out.print("sozu daxil edin: ");
                String str = in.nextLine();

                System.out.print("Saitlerin sayi " + saitisay (str));
            }
            public static int saitisay(String str)
            {
                int sayi = 0;
                for (int i = 0; i < str.length(); i++)
                {
                    if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                            || str.charAt(i) == 'o' || str.charAt(i) == 'u')
                    {
                        sayi++;
                    }
                }
                return sayi;
            }
        }

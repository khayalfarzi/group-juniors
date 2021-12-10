package az.iktlab.juniors.java_lessons.lesson_7;

import java.util.Scanner;

//İlkin səviyyə üçün Initial (1-dən 3-ə qədər), orta üçün Average (4-dən 6-ya qədər), kafi üçün Sufficient (7-dən 9-a qədər)
// və yüksək səviyyə üçün High (10-dan 12-yə qədər) sözlərini çıxışa verin.
public class Sagirdinqiymetleri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qiymet = sc.nextInt();
        if (1<=qiymet && qiymet<=3){
            System.out.println("Initial");
        }
           else if(4<=qiymet && qiymet<=6) {
            System.out.println("Average");
           }
        else if(7<=qiymet && qiymet<=9 ){
            System.out.println("Sufficient");
        }
        else {
            System.out.println("High");
        }

    }
}

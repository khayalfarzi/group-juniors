package az.iktlab.juniors.java_lessons.lesson_17;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        AlgorithmChecker checker = new AlgorithmChecker();

//        int[] smallArr = RandomArrGenerator.generateRndArr(10, "small.csv");
//        long consumingS = checker.checkSortMethod(smallArr);
//        System.out.println("Consuming for small: " + consumingS);
//        System.out.println(checker.counter);
//
//        int[] mediumArr = RandomArrGenerator.generateRndArr(100, "medium.csv");
//        long consumingM = checker.checkSortMethod(mediumArr);
//        System.out.println("Consuming for medium: " + consumingM);
//        System.out.println(checker.counter);

        int[] bigSavedArr = RandomArrGenerator.generateRndArr(10_000_000, "big.csv");
        long consumingB = checker.checkSortMethod(bigSavedArr);
        System.out.println("Consuming for big: " + consumingB);
        System.out.println(checker.counter);


//        int[] extremelyArr = RandomArrGenerator.generateRndArrr();
//        long consumingEx = checker.checkSortMethod(extremelyArr);
//        System.out.println("Consuming for extremely: " + consumingEx);
//        System.out.println(checker.counter);
    }
}

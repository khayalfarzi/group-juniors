package az.iktlab.juniors.java_lessons.lesson_19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReaderExample {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\Khayal Farziyev\\IdeaProjects\\group-juniors\\src\\main\\java\\az\\iktlab\\juniors\\java_lessons\\lesson_19\\newFile.txt");

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext())
                System.out.println(scanner.next());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

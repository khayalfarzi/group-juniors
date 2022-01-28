package az.iktlab.juniors.java_lessons.lesson_19;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Khayal Farziyev\\IdeaProjects\\group-juniors\\src\\main\\java\\az\\iktlab\\juniors\\java_lessons\\lesson_19\\newFile.txt");

        if (!file.exists()) {
            try {
                System.out.println("Is file created: " + file.createNewFile());
                System.out.println("Is file created: " + file.createNewFile());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try (FileWriter writer = new FileWriter(file)) {

            for (int i = 0; i < 10; i++) {
                writer.write(i + "\n");
                writer.flush();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package az.iktlab.juniors.java_lessons.lesson_12;

public class Person extends Human implements I{

    private String gender;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public void read() {
        System.out.println("Person is reading");
    }
}

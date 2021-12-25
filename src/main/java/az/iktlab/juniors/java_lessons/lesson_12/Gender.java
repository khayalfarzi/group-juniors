package az.iktlab.juniors.java_lessons.lesson_12;

public enum Gender {
    MALE("This is Kisi"), FEMALE("This is Qadin");

    private final String val;

    Gender(String val) {
        this.val = val;
    }

    public String getVal() {
        return val;
    }
}

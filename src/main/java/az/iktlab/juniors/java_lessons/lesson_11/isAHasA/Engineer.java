package az.iktlab.juniors.java_lessons.lesson_11.isAHasA;

import java.math.BigDecimal;
import java.util.Objects;

public class Engineer extends Human {

    private BigDecimal salary;
    private Human human;

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public Human getHuman() {
        return human;
    }

    public void setHuman(Human human) {
        this.human = human;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engineer engineer = (Engineer) o;
        return Objects.equals(salary, engineer.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(salary);
    }

    @Override
    public String toString() {
        return "Engineer{" +
                "salary=" + salary +
                '}';
    }
}

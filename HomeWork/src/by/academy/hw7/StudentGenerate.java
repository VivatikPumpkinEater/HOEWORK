package hw7V7;

import java.io.Serializable;
import java.util.Objects;

public class StudentGenerate implements Serializable {
    private String name;
    private String name2;

    public StudentGenerate(String name, String name2) {
        this.name = name;
        this.name2 = name2;
    }

    public String getName() {
        return name;
    }

    public String getName2() {
        return name2;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentGenerate student = (StudentGenerate) o;
        return Objects.equals(name, student.name) &&
                Objects.equals(name2, student.name2);
    }


    @Override
    public String toString() {
        return String.format("Student{Name: %s %s}", name, name2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, name2);
    }
}

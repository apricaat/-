package Task13;
import java.util.Objects;

public class Student {
    int idNumber;
    int score;

    String name;
    String surname;

    public Student(int idNumber, int score, String name, String surname) {
        this.idNumber = idNumber;
        this.score = score;
        this.name = name;
        this.surname = surname;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Task22.Student{" +
                "idNumber=" + idNumber +
                ", score=" + score +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getIdNumber() == student.getIdNumber() && getScore() == student.getScore() && Objects.equals(getName(), student.getName()) && Objects.equals(getSurname(), student.getSurname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdNumber(), getScore(), getName(), getSurname());
    }
}

package Task13;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class TestStudent {
    public static Student[] createStudents(int counter) {
        Student[] students = new Student[counter];
        Random random = new Random();

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(
                    random.nextInt(0, 250),
                    random.nextInt(0, 100),
                    String.format("Name%d", i),
                    String.format("Surname%d", i)
            );
        }

        return students;
    }

    public static void sortStudents(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students.length - 1; j++) {
                if (students[j].getIdNumber() > students[j + 1].getIdNumber()) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Student[] students = createStudents(3);
        for (Student student : students) {
            System.out.println(student);
        }
        Comparator<Student> studentsByGPA = new SortingStudentByGPA();
        Arrays.sort(students, studentsByGPA);

        System.out.println();
        for (Student student : students) {
            System.out.println(student);
        }

        sortStudents(students);
        System.out.println();
        for (Student student : students) {
            System.out.println(student);
        }

        Student[] mergeStudents = new Student[students.length * 2];
        System.arraycopy(students.clone(), 0, mergeStudents, 0, students.length);
        Arrays.sort(students, studentsByGPA);
        if (students.length * 2 - students.length >= 0)
            System.arraycopy(students, 0, mergeStudents, students.length, students.length);
        System.out.println();
        for (Student student : mergeStudents) {
            System.out.println(student);
        }
    }
}
package Task15;

import java.util.ArrayList;

public class Punkt1 {


    public static void main(String[] args) {
        ArrayList<Student> task = new ArrayList<>();

        Student julia = new Student("Julia");
        Student polina = new Student("Polina");
        Student alice = new Student("Alice");
        Student test = new Student("Cat");

        task.add(julia);
        task.add(polina);
        task.add(test);

        int position = task.indexOf(polina);
        task.remove(2);
        System.out.println(task + "\n");
        System.out.println("Размер массива: " + task.size());
        System.out.println(task.get(0));

        task.add(1, alice);
        System.out.println(task + "\n");

        task.clear();
        System.out.println(task);





    }
}
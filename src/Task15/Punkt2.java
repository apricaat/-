package Task15;

import java.util.LinkedList;

public class Punkt2 {
    public static void main(String[] args) {

        String str1 = new String("Hello World!");
        String str2 = new String("My name is Julia");
        String str3 = new String("I love Java");
        String str4 = new String("I live in Moscow");

        LinkedList<String> earlBio = new LinkedList<>();
        earlBio.add(str1);
        earlBio.add(str2);
        earlBio.add(1, str3);

        System.out.println(earlBio);
        System.out.println(earlBio.get(0) + "\n");
        earlBio.addFirst(str4);
        earlBio.addLast(str4);
        System.out.println(earlBio + "\n");
        System.out.println(earlBio.peekFirst());

    }
}




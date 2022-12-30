package Task20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static List<String> convertToList(String data) {
        List<String> list = new ArrayList<>();
        for (char x : data.toCharArray()) {
            list.add(String.valueOf(x));
        }

        return list;
    }

    public static List<Integer> convertToList(int data) {
        List<Integer> list = new ArrayList<>();

        for (char x : Integer.toString(data).toCharArray()) {
            list.add(Integer.parseInt(String.valueOf(x)));
        }

        return list;
    }

    public static <T> void addList(List<T> list, T[] array){
        list.addAll(Arrays.asList(array));
        System.out.print("[");
        for (int i = 0; i < list.size() - (list.size() - 5); i++) {
            System.out.print(list.get(i).toString() + ", ");
        }
        System.out.print("\b\b ... ]\n");
    }

    public static void main(String[] args) {
        System.out.println(convertToList("fsdfsdfsf"));
        System.out.println(convertToList(123434141));
        Object[] objects = new Object[] {1, 2, 3, 4};
        ObjectArray objectArray = new ObjectArray() {{
            add(1);
            add(1.2);
            add("Array");
            add(0b10);
            add(3424L);
            add(3424D);
            add(334F);
            add(12.0 / 0.0);
            add(-12.0 / 0.0);
            add(Math.sqrt(-4));
            add('\u0066');
        }};

        System.out.println(objectArray);
        System.out.println(objectArray.get(9));

        List<String> list = convertToList("fsdfsdfsf");
        addList(list, new String[]{"1", "2", "3", "4"});

        System.out.println(list);
        System.out.println();

        System.out.println(objectArray.newArrayList(Integer.class));
        System.out.println(objectArray.newArrayList(Character.class));
        System.out.println(objectArray.newArrayList(Long.class));
        System.out.println();

        System.out.println(objectArray.newHashSet(Long.class, Integer.class));

    }
}

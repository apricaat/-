package Task15;

public class Punkt3 {
    public static void main(String[] args) {
        MyArrayList<Integer> arr = new MyArrayList<Integer>(Integer.class, 10);
        for(int i=0; i<10; i++){
            arr.add((int)(1+Math.random()*10));
        }
        System.out.println(arr.toString());

        System.out.println("Значение второго элемента " + arr.get(2));

        arr.set(3,10);
        System.out.println("Установка 10 на место третьего элемнета " + arr.toString());

        arr.remove(10);
        System.out.println("Удаление элемента со значением 10 " + arr.toString());
    }
}

package Task20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ObjectArray {
    Object[] array = new Object[0];

    public void add(Object obj) {
        Object[] newArray = new Object[array.length + 1];
        System.arraycopy(array, 0, newArray, 0, array.length);
        newArray[array.length] = obj;
        array = newArray.clone();
    }

    public static <T> List<T> newArrayList(Class<T> tClass, Object[] array) {
        List<T> list = new ArrayList<>();

        System.out.println();

        for (Object obj : array) {
            try {
                if (tClass == obj.getClass()) {
                    list.add((T) obj);
                }
            } catch (Exception ignored) {

            }
        }

        return list;
    }

    public <T> List<T> newArrayList(Class<T> tClass) {
        List<T> list = new ArrayList<>();

        System.out.println();

        for (Object obj : array) {
            try {
                if (tClass == obj.getClass()) {
                    list.add((T) obj);
                }
            } catch (Exception ignored) {

            }
        }

        return list;
    }

    public <K, V> HashMap<K, List<V>> newHashSet(Class<K> typeKey, Class<V> typeValue) {
        HashMap<K, List<V>> hashMap = new HashMap<>();
        for (Object obj : array) {
            if (typeKey == obj.getClass()) {
                try {
                    hashMap.put((K) obj, newArrayList(typeValue, array));
                    break;
                } catch (Exception ignored) {

                }
            }
        }

        return hashMap;
    }

    public Object get(int index) {
        return array[index];
    }

    public ObjectArray() {
    }

    public ObjectArray(Object[] array) {
        this.array = array;
    }

    public Object[] getArray() {
        return array;
    }

    public void setArray(Object[] array) {
        this.array = array;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ObjectArray)) return false;
        ObjectArray that = (ObjectArray) o;
        return Arrays.equals(getArray(), that.getArray());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getArray());
    }

    @Override
    public String toString() {
        return "Task20.ObjectArray{" + "array=" + Arrays.toString(array) + '}';
    }
}

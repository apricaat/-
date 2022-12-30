package Task23;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> users = new HashMap<>();
        users.put("Рахманов", "Амир");
        users.put("Зайцев", "Антон");
        users.put("Сергеевич", "Сергей");
        users.put("Рахматуров", "Андрей");
        users.put("Алёхин", "Антон");

        ArrayList<String> repeatName = new ArrayList<>();

        String[] keys = users.keySet().toArray(new String[0]);
        String[] values = users.values().toArray(new String[0]);

        for (int i = 0; i < values.length; i++) {
            for (int j = i + 1; j < values.length; j++) {
                if (values[i].equals(values[j])) {
                    repeatName.add(keys[i]);
                    repeatName.add(keys[j]);
                }
            }
        }
        for (String key : repeatName.toArray(new String[0])) {
            users.remove(key);
        }

        System.out.println(users);

        Map<String, ArrayList<String>> map = new HashMap<>() {{
            put("Россия", new ArrayList<String>() {{
                add("Москва");
                add("Саратов");
                add("Лобня");
                add("Краснодар");
                add("Новосибирск");
                add("Хабаровск");
            }});
            put("Англия", new ArrayList<String>() {{
                add("Лондон");
                add("Бирменгем");
                add("Лидс");
                add("Шеффилд");
                add("Манчестер");
                add("Ливерпуль");
            }});
        }};

        ArrayList<City> cities = new ArrayList<>();

        for(String keys1: map.keySet()){
            for(String value1: map.get(keys1)){
                cities.add(new City(keys1, value1));
            }
        }

        System.out.println(cities);
    }
}

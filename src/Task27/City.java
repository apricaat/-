package Task27;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class City {
    private String city;
    private String country;
    public City(String city, String country){
        this.city=city;
        this.country=country;
    }

    public static void main(String[] args) {
        City city1 = new City("Moscow", "Russia");
        City city2 = new City("Istanbul", "Turkey");
        City city3 = new City("Budapest", "Hungary");
        City city4 = new City("Washington", "USA");
        City city5 = new City("Tver", "Russia");
        City[] cities = new City[]{city1, city2, city3, city4, city5};

        Map<String, ArrayList<String>> map = new HashMap<>(5);
        for (int i=0;i<cities.length;i++){
            if(!map.containsKey(cities[i].country))
                map.put(cities[i].country, null);
        }
        for(Map.Entry<String, ArrayList<String>> item : map.entrySet()){
            ArrayList<String> tmp = new ArrayList<String>();
            for(int i =0;i<cities.length;i++) {
                if (item.getKey() == cities[i].country)
                    tmp.add(cities[i].city);
            }
            item.setValue(tmp);
        }
        for(Map.Entry<String, ArrayList<String>> item : map.entrySet()){
            System.out.println(item.getKey()+" "+item.getValue());
            System.out.println();
        }
    }
}

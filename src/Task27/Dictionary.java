package Task27;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    public static HashMap<String, String> createmap(){
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Semenov","Vladimir");
        map.put("Hasanbaev", "Ikrom");
        map.put("Suponin", "Alex");
        map.put("Smirnov", "Alex");
        map.put("Hitrov", "Pavel");
        return map;
    }
    public static void removeNameDuplicates(HashMap<String, String> map){
        HashMap<String,String> copy = new HashMap<String,String>(map);
        for (Map.Entry<String,String> s : copy.entrySet()){
            for (Map.Entry<String,String> s1 : copy.entrySet()){
                if(s.getValue().equals(s1.getValue()) && !s.getKey().equals(s1.getKey()))
                    removeItemFromMapByVal(map,s.getValue());
            }
        }
    }
    public static void removeItemFromMapByVal(HashMap<String,String> map, String val){
        HashMap<String,String> copy = new HashMap<String,String>(map);
        for(Map.Entry<String,String> pair : copy.entrySet()){
            if(pair.getValue().equals(val))
                map.remove(pair.getKey());
        }
    }
    public static void main(String[] args) {
        HashMap<String,String> map = createmap();
        System.out.println(map);
        removeNameDuplicates(map);
        System.out.println(map);
    }
}

package mid2.collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class ArrayToMapTest {

    public static void main(String[] args) {
        String[][] productArr = {{"Java", "10000"}, {"Spring", "20000"},
            {"JPA", "30000"}};

        Map<String, Integer> productMap = new HashMap<>();
        for (String[] strings : productArr) {
            productMap.put(strings[0], Integer.valueOf(strings[1]));
        }

        for (String s : productMap.keySet()) {
            System.out.printf("제품: %s, 가격: %d\n", s, productMap.get(s));
        }

    }
}
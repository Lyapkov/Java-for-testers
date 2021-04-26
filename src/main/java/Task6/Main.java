package Task6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String fileName = "src/main/file.txt";
        try {
            String content = Files.lines(Paths.get(fileName)).reduce("", String::concat);

            String[] array = content.split(" ");
            TreeSet<String> list = new TreeSet<>(Arrays.asList(array));
            System.out.println(list);

            TreeMap<String, Integer> map = new TreeMap<>();
            for (String value : array) {
                map.merge(value, 1, (oldVal, newVal) -> oldVal + newVal);
            }
            int max = map.values().stream().max(Integer::compare).get();
            String key = "";
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                if (max == entry.getValue())
                    key = entry.getKey();
            }
            System.out.println(key + " это слово встречается " + max + " раз");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

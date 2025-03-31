import java.util.*;

public class Hash {

    public static void main(String[] args) {
        Map<String, Integer> marks = new HashMap<>();

        marks.put("rahul", 100);
        marks.put("mohit", 129);

        // for each loop over the marks map
        for (Map.Entry<String, Integer> entry : marks.entrySet()) {
            System.out.print(entry.getKey() + "---->");
            System.out.println(entry.getValue());
        }

        // List, Map, Set, ImmutableList

    }
}
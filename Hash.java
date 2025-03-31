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

        // * if the key not present in the map, we will get null pointer exception error
        System.out.println(marks.get("aman") > 100);

        // * to avoid this error we have optional
        Optional<Integer> marksOfAman = Optional.ofNullable(marks.get("aman"));
        System.out.println(marksOfAman);
        if (marksOfAman.isPresent()) {

        } else {
            System.out.println("Student not present");
        }
    }
}
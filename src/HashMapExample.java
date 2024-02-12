import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {
        // Create a HashMap to store strings with associated keys
        Map<Integer, String> stringMap = new HashMap<>();

        // Add elements to the map
        addElement(stringMap, 1, "Apple");
        addElement(stringMap, 2, "Banana");
        addElement(stringMap, 3, "Cherry");

        // Display the elements in the map
        displayMap(stringMap);

        // Add an element with a specific key
        addElement(stringMap, 4, "Orange");
        displayMap(stringMap);

        // Remove an element with a specific key
        removeElement(stringMap, 2);
        displayMap(stringMap);

        // Display the size of the map
        displaySize(stringMap);

        // Check if the map contains a specific key or value
        checkKeyPresence(stringMap, 3);
        checkValuePresence(stringMap, "Banana");

        // Clear the map
        clearMap(stringMap);
        displayMap(stringMap);
    }

    private static void addElement(Map<Integer, String> map, Integer key, String value) {
        map.put(key, value);
        System.out.println("Added: Key=" + key + ", Value=" + value);
    }

    private static void removeElement(Map<Integer, String> map, Integer key) {
        String removedValue = map.remove(key);
        System.out.println("Removed element with Key=" + key + ": Value=" + removedValue);
    }

    private static void displayMap(Map<Integer, String> map) {
        System.out.println("HashMap: " + map);
    }

    private static void displaySize(Map<Integer, String> map) {
        System.out.println("Size of HashMap: " + map.size());
    }

    private static void checkKeyPresence(Map<Integer, String> map, Integer key) {
        System.out.println("Does HashMap contain key " + key + "? " + map.containsKey(key));
    }

    private static void checkValuePresence(Map<Integer, String> map, String value) {
        System.out.println("Does HashMap contain value '" + value + "'? " + map.containsValue(value));
    }

    private static void clearMap(Map<Integer, String> map) {
        map.clear();
        System.out.println("HashMap cleared.");
    }
}

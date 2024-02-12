import java.util.LinkedList;

public class StringLinkedListExample {

    public static void main(String[] args) {
        // Create a LinkedList to store strings
        LinkedList<String> stringList = new LinkedList<>();

        // Add elements to the linked list
        addElement(stringList, "Apple");
        addElement(stringList, "Banana");
        addElement(stringList, "Cherry");

        // Display the elements in the linked list
        displayList(stringList);

        // Add an element at a specific index
        addElementAtIndex(stringList, 1, "Orange");
        displayList(stringList);

        // Remove an element at a specific index
        removeElementAtIndex(stringList, 2);
        displayList(stringList);

        // Display the size of the linked list
        displaySize(stringList);

        // Check if the linked list is empty
        displayIsEmpty(stringList);

        // Check if a specific string is present in the linked list
        checkStringPresence(stringList, "Banana");

        // Get the index of a specific string
        getIndex(stringList, "Cherry");

        // Clear the linked list
        clearList(stringList);
        displayList(stringList);
    }

    private static void addElement(LinkedList<String> list, String element) {
        list.add(element);
        System.out.println("Added: " + element);
    }

    private static void addElementAtIndex(LinkedList<String> list, int index, String element) {
        list.add(index, element);
        System.out.println("Added '" + element + "' at index " + index);
    }

    private static void removeElementAtIndex(LinkedList<String> list, int index) {
        String removedElement = list.remove(index);
        System.out.println("Removed element at index " + index + ": " + removedElement);
    }

    private static void displayList(LinkedList<String> list) {
        System.out.println("Linked list: " + list);
    }

    private static void displaySize(LinkedList<String> list) {
        System.out.println("Size of linked list: " + list.size());
    }

    private static void displayIsEmpty(LinkedList<String> list) {
        System.out.println("Is the linked list empty? " + list.isEmpty());
    }

    private static void checkStringPresence(LinkedList<String> list, String element) {
        System.out.println("Is '" + element + "' present in the linked list? " + list.contains(element));
    }

    private static void getIndex(LinkedList<String> list, String element) {
        int index = list.indexOf(element);
        if (index != -1) {
            System.out.println("Index of '" + element + "': " + index);
        } else {
            System.out.println("'" + element + "' not found in the linked list.");
        }
    }

    private static void clearList(LinkedList<String> list) {
        list.clear();
        System.out.println("Linked list cleared.");
    }
}

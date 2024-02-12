import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        // Lambda expressions instead of anonymous inner classes
        // Exemple 1: Trie les noms en utilisant un Comparator
        List<String> names = Arrays.asList("John", "Alice", "Bob", "Carol");
        Collections.sort(names, (String a, String b) -> a.compareTo(b));
        System.out.println("Sorted names: " + names);

        // Stream API examples
        // Exemple 2: Filtrer les nombres pairs
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Even numbers: " + evenNumbers);

        // Exemple 3: Appliquer une fonction à chaque élément
        List<Integer> squares = numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println("Squares: " + squares);

        // Exemple 4: Collecter les éléments dans une structure de données finale
        String concatenated = numbers.stream()
                .map(Object::toString)
                .collect(Collectors.joining(", "));
        System.out.println("Concatenated: " + concatenated);

        // Exemple 5: Compter le nombre d'éléments
        long count = numbers.stream()
                .count();
        System.out.println("Count: " + count);

        // Exemple 6: Limiter le nombre d'éléments à traiter
        List<Integer> limited = numbers.stream()
                .limit(3)
                .collect(Collectors.toList());
        System.out.println("Limited: " + limited);

        // Exemple 7: Supprimer les doublons
        List<Integer> duplicateNumbers = Arrays.asList(1, 2, 3, 1, 2, 3, 4, 5);
        List<Integer> distinctNumbers = duplicateNumbers.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Distinct numbers: " + distinctNumbers);

        // Reduce example
        // Exemple 8: Réduire les éléments à une seule valeur
        int sum = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println("Sum: " + sum);

        // FlatMap example
        // Exemple 9: Aplatir une liste de listes
        List<List<Integer>> listOfLists = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4), Arrays.asList(5, 6));
        List<Integer> flattenedList = listOfLists.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
        System.out.println("Flattened list: " + flattenedList);

        // Matching operations
        // Exemple 10: Vérifier si tous les éléments satisfont à une condition
        boolean allGreaterThanZero = numbers.stream()
                .allMatch(n -> n > 0);
        System.out.println("All greater than zero? " + allGreaterThanZero);

        // Exemple 11: Vérifier si au moins un élément satisfait à une condition
        boolean anyLessThanZero = numbers.stream()
                .anyMatch(n -> n < 0);
        System.out.println("Any less than zero? " + anyLessThanZero);
    }
}

import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetVsHashSet {
    public static void main(String[] args) {
        // Création d'un HashSet
        HashSet<Integer> hashSet = new HashSet<>();
        // Création d'un TreeSet (qui implémente SortedSet)
        SortedSet<Integer> sortedSet = new TreeSet<>();

        // Ajout d'éléments au HashSet
        hashSet.add(5);
        hashSet.add(2);
        hashSet.add(8);

        // Ajout d'éléments au TreeSet
        sortedSet.add(5);
        sortedSet.add(2);
        sortedSet.add(8);

        // Affichage des éléments du HashSet
        System.out.println("HashSet:");
        for (Integer num : hashSet) {
            System.out.println(num);
        }

        // Affichage des éléments du TreeSet
        System.out.println("TreeSet:");
        for (Integer num : sortedSet) {
            System.out.println(num);
        }

        // Exemple de recherche dans le HashSet
        System.out.println("Recherche dans le HashSet:");
        System.out.println(hashSet.contains(5));

        // Exemple de recherche dans le TreeSet
        System.out.println("Recherche dans le TreeSet:");
        System.out.println(sortedSet.contains(5));

        // Exemple de suppression dans le HashSet
        hashSet.remove(5);
        System.out.println("Après suppression dans le HashSet:");
        for (Integer num : hashSet) {
            System.out.println(num);
        }

        // Exemple de suppression dans le TreeSet
        sortedSet.remove(5);
        System.out.println("Après suppression dans le TreeSet:");
        for (Integer num : sortedSet) {
            System.out.println(num);
        }
    }
}
//HashSet n'assure aucun ordre spécifique des éléments, tandis que SortedSet (comme TreeSet) maintient les éléments triés dans l'ordre naturel ou selon un comparateur spécifié.
//Lorsque vous itérez sur un HashSet, l'ordre des éléments peut varier d'exécution en exécution, tandis que l'ordre des éléments dans un TreeSet est déterminé par la structure d'arbre sous-jacente et est toujours trié.
//Les performances des opérations de recherche, d'insertion et de suppression sont similaires dans les deux implémentations, mais TreeSet peut avoir une légère surcharge en termes de mémoire et de performances en raison du maintien de l'ordre des éléments.
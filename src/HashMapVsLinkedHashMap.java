import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapVsLinkedHashMap {
    public static void main(String[] args) {
        // Création d'une HashMap
        Map<Integer, String> hashMap = new HashMap<>();
        // Création d'une LinkedHashMap
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();

        // Ajout d'éléments à la HashMap
        hashMap.put(1, "Java");
        hashMap.put(2, "Python");
        hashMap.put(3, "C++");

        // Ajout d'éléments à la LinkedHashMap
        linkedHashMap.put(1, "Java");
        linkedHashMap.put(2, "Python");
        linkedHashMap.put(3, "C++");

        // Affichage des éléments de la HashMap
        System.out.println("HashMap:");
        for (Integer key : hashMap.keySet()) {
            System.out.println(key + ": " + hashMap.get(key));
        }

        // Affichage des éléments de la LinkedHashMap
        System.out.println("LinkedHashMap:");
        for (Integer key : linkedHashMap.keySet()) {
            System.out.println(key + ": " + linkedHashMap.get(key));
        }

        // Exemple d'accès à un élément par clé dans la HashMap
        System.out.println("Accès à un élément par clé dans la HashMap:");
        System.out.println(hashMap.get(2));

        // Exemple d'accès à un élément par clé dans la LinkedHashMap
        System.out.println("Accès à un élément par clé dans la LinkedHashMap:");
        System.out.println(linkedHashMap.get(2));

        // Exemple de suppression d'un élément dans la HashMap
        hashMap.remove(2);
        System.out.println("Après suppression dans la HashMap:");
        for (Integer key : hashMap.keySet()) {
            System.out.println(key + ": " + hashMap.get(key));
        }

        // Exemple de suppression d'un élément dans la LinkedHashMap
        linkedHashMap.remove(2);
        System.out.println("Après suppression dans la LinkedHashMap:");
        for (Integer key : linkedHashMap.keySet()) {
            System.out.println(key + ": " + linkedHashMap.get(key));
        }
    }
}
//HashMap ne garantit pas un ordre spécifique des éléments, alors que LinkedHashMap maintient l'ordre d'insertion des éléments.
//Lorsque vous itérez sur une HashMap, l'ordre des éléments peut varier d'exécution en exécution, tandis que l'ordre des éléments dans une LinkedHashMap reste constant tant qu'il n'y a pas de modifications structurelles (comme l'ajout ou la suppression d'éléments).
//Les performances des opérations de recherche, d'insertion et de suppression sont similaires dans les deux implémentations, mais LinkedHashMap a une légère surcharge en termes de mémoire et de performances en raison de la gestion de l'ordre des éléments.
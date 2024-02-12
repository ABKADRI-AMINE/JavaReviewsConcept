import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVsLinkedList {
    public static void main(String[] args) {
        // Création d'une ArrayList
        List<Integer> arrayList = new ArrayList<>();
        // Création d'une LinkedList
        List<Integer> linkedList = new LinkedList<>();

        // Ajout d'éléments à l'ArrayList
        for (int i = 0; i < 5; i++) {
            arrayList.add(i);
        }

        // Ajout d'éléments à la LinkedList
        for (int i = 0; i < 5; i++) {
            linkedList.add(i);
        }

        // Affichage des éléments de l'ArrayList
        System.out.println("ArrayList:");
        for (Integer num : arrayList) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Affichage des éléments de la LinkedList
        System.out.println("LinkedList:");
        for (Integer num : linkedList) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Exemple d'accès direct à un élément dans une ArrayList
        System.out.println("Accès direct à un élément dans l'ArrayList:");
        System.out.println(arrayList.get(2));

        // Exemple d'accès direct à un élément dans une LinkedList
        System.out.println("Accès direct à un élément dans la LinkedList:");
        System.out.println(linkedList.get(2));

        // Exemple de suppression d'un élément en milieu de liste dans une ArrayList
        arrayList.remove(2);
        System.out.println("Après suppression dans l'ArrayList:");
        for (Integer num : arrayList) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Exemple de suppression d'un élément en milieu de liste dans une LinkedList
        linkedList.remove(2);
        System.out.println("Après suppression dans la LinkedList:");
        for (Integer num : linkedList) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
//Ce code montre comment utiliser ArrayList et LinkedList en Java et effectue quelques opérations pour illustrer leurs différences. Voici un bref résumé des principales différences :
//
//ArrayList stocke les éléments dans un tableau dynamique, ce qui permet un accès rapide aux éléments par index, mais l'insertion et la suppression d'éléments en milieu de liste peuvent être coûteuses car cela peut nécessiter le décalage des éléments.
//LinkedList stocke les éléments sous forme de nœuds liés, ce qui permet une insertion et une suppression efficaces en milieu de liste, mais l'accès direct aux éléments par index est moins efficace car il nécessite de parcourir la liste à partir du début ou de la fin.
//En général, si vous avez besoin d'un accès rapide aux éléments par index et que vous effectuez principalement des opérations de lecture, ArrayList est souvent préférable. Si vous effectuez principalement des opérations d'insertion et de suppression en milieu de liste, LinkedList peut être plus efficace.

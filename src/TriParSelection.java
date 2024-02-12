public class TriParSelection {

    public static void triSelection(int[] tableau) {
        int n = tableau.length;

        for (int i = 0; i < n - 1; i++) {
            int indexMin = i;

            // Trouver l'index du plus petit élément restant dans le tableau
            for (int j = i + 1; j < n; j++) {
                if (tableau[j] < tableau[indexMin]) {
                    indexMin = j;
                }
            }

            // Échanger l'élément trouvé avec l'élément à la position i
            int temp = tableau[indexMin];
            tableau[indexMin] = tableau[i];
            tableau[i] = temp;
        }
    }

    public static void afficherTableau(int[] tableau) {
        for (int i = 0; i < tableau.length; i++) {
            System.out.print(tableau[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] tableau = {64, 25, 12, 22, 11};

        System.out.println("Tableau avant le tri : ");
        afficherTableau(tableau);

        triSelection(tableau);

        System.out.println("Tableau après le tri par sélection : ");
        afficherTableau(tableau);
    }
}

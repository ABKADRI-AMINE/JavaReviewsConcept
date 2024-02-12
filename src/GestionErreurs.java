import java.util.Scanner;

public class GestionErreurs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Veuillez entrer un nombre entier : ");
            int number = scanner.nextInt();

            // Utilisation d'une assertion pour vérifier que le nombre est positif
            assert number > 0 : "Le nombre doit être positif";

            // Utilisation d'une méthode pour simuler une opération qui peut générer une exception
            int result = divideByTwo(number);
            System.out.println("Résultat de la division par deux : " + result);

        } catch (java.util.InputMismatchException e) {
            System.out.println("Erreur : Vous devez entrer un nombre entier.");
        } catch (AssertionError e) {
            System.out.println("Assertion échouée : " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Erreur arithmétique : " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Une erreur inattendue s'est produite : " + e.getMessage());
        } finally {
            // Le bloc finally est toujours exécuté, que l'exception soit levée ou non
            System.out.println("Le programme a terminé son exécution.");
        }
    }

    // Méthode qui simule une division par deux
    private static int divideByTwo(int number) {
        if (number % 2 != 0) {
            throw new ArithmeticException("Le nombre n'est pas divisible par deux.");
        }
        return number / 2;
    }
}

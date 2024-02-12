import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) {
        // Liste de personnes avec leur âge
        List<Person> people = Arrays.asList(
                new Person("John", 30),
                new Person("Alice", 25),
                new Person("Bob", 35),
                new Person("Carol", 40)
        );

        // Utilisation de fonctions personnalisées pour filtrer, mapper et regrouper
        List<Person> filteredPeople = filterPeople(people, p -> p.getAge() > 30);
        System.out.println("Filtered people: " + filteredPeople);

        List<String> mappedNames = mapPeopleToNames(people, Person::getName);
        System.out.println("Mapped names: " + mappedNames);

        Map<Integer, List<Person>> groupedByAge = groupPeopleByAge(people);
        System.out.println("Grouped by age: " + groupedByAge);

        // Utilisation de l'API Stream pour effectuer les mêmes opérations
        List<Person> filteredPeopleStream = people.stream()
                .filter(p -> p.getAge() > 30)
                .collect(Collectors.toList());
        System.out.println("Filtered people using Stream API: " + filteredPeopleStream);

        List<String> mappedNamesStream = people.stream()
                .map(Person::getName)
                .collect(Collectors.toList());
        System.out.println("Mapped names using Stream API: " + mappedNamesStream);

        Map<Integer, List<Person>> groupedByAgeStream = people.stream()
                .collect(Collectors.groupingBy(Person::getAge));
        System.out.println("Grouped by age using Stream API: " + groupedByAgeStream);
    }

    // Fonction personnalisée pour filtrer les personnes
    public static List<Person> filterPeople(List<Person> people, Function<Person, Boolean> filter) {
        List<Person> filteredPeople = new ArrayList<>();
        for (Person person : people) {
            if (filter.apply(person)) {
                filteredPeople.add(person);
            }
        }
        return filteredPeople;
    }

    // Fonction personnalisée pour mapper les noms des personnes
    public static List<String> mapPeopleToNames(List<Person> people, Function<Person, String> mapper) {
        List<String> mappedNames = new ArrayList<>();
        for (Person person : people) {
            mappedNames.add(mapper.apply(person));
        }
        return mappedNames;
    }

    // Fonction personnalisée pour regrouper les personnes par âge
    public static Map<Integer, List<Person>> groupPeopleByAge(List<Person> people) {
        Map<Integer, List<Person>> groupedByAge = new HashMap<>();
        for (Person person : people) {
            groupedByAge.computeIfAbsent(person.getAge(), k -> new ArrayList<>()).add(person);
        }
        return groupedByAge;
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

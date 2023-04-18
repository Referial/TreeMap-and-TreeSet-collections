import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("Petya", "Petrov", 17));
        people.add(new Person("Tanya", "Sidorova", 32));
        people.add(new Person("Olya", "Kazakova", 15));
        people.add(new Person("Masha", "Vasnizova", 43));
        System.out.println(people);

        System.out.println(people);

        Collections.sort(people, new PersonSurnameSort());

        System.out.println(people);

        people.removeIf(person -> person.getAge()<18);

        System.out.println(people);
    }
}

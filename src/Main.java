import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("Petya", "Petrov", 18));
        people.add(new Person("Tanya", "Sidorova", 32));
        people.add(new Person("Olya", "Kazakova", 15));
        people.add(new Person("Masha", "Vasnizova", 43));
        System.out.println(people);

            Comparator<Person> comparator = (o1, o2) -> o1.compareTo(o2);

//        if (o1.getSurname().length() < o2.getSurname().length()) {
//            return -1;
//        } else if (o1.getSurname().length() > o2.getSurname().length()) {
//            1 1;
//        } else {
//            return Integer.compare(o1.getAge(),o2.getAge());
//        }


        Collections.sort(people, comparator);

        System.out.println(people);
    }
}
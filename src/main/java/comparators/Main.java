package comparators;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(new Person("Adam", "Nowak", 20),
                new Person("Jan", "Nowak", 21), new Person("Jan", "Kowalski", 20));

        Comparator<String> stringComparator1 = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };
        Comparator<String> stringComparator2 = (o1, o2) -> o1.compareTo(o2);
        Comparator<String> stringComparator3 = String::compareTo;
        Person person1 = new Person().withAge(21).withName("Jan").withSurname("Kowalskiiiii");
        Person person2 = new Person();
        person2.withAge(12);
        person2.withName("asdasdqwe");
        person2.withSurname("asdqweqweasddqweqweqwweqwe");
        Comparator<Person> comparator = Comparator.comparing(Person::getSurname).thenComparing(Person::getName);
        people.sort(comparator.reversed());
        System.out.println(people);
    }
}

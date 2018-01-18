package comparators;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Adam", "Kowalski", 21);
        if (person.getSecondName().isPresent()) {
            System.out.println(person.getSecondName().get().length());
        }

        person.getSecondName().ifPresent(System.out::println);


        List<Integer> list = new ArrayList<>();
        Optional<Integer> optional = Optional.of(2);
        Integer integer = optional.orElse(2);
        Integer integer1 = optional.orElseThrow(IllegalArgumentException::new);
        optional.orElseGet(() -> 5);
        optional.ifPresent(list::add);
        boolean present = optional.isPresent();
        Integer integer2 = optional.map(i -> i * 5).orElse(3);
        Integer integer3 = optional.filter(i -> i < 3).orElse(0);
    }

    public static void map() {
        Map<String, Optional<Integer>> map = new HashMap<>();
        map.put("A", Optional.of(1));
        map.put("B", Optional.of(2));
        map.put("C", Optional.empty());
        map.put("D", Optional.of(3));
        System.out.println(map.get("A"));
        System.out.println(map.get("B"));
        System.out.println(map.get("C"));
        System.out.println(map.get("D"));
        System.out.println(map.get("E"));


    }
}

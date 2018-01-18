package comparators;

import java.util.Optional;

public class Person {
    private final String firstName;
    private String secondName;
    private final String surname;
    private final int age;

    public Person(String firstName, String surname, int age) {
        this.firstName = firstName;
        this.surname = surname;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public Optional<String> getSecondName() {
        return Optional.ofNullable(secondName);
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }
}

package comparators;

public class Person {
    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public Person withName(String name) {
        this.name = name;

        return this;
    }

    public Person withSurname(String surname) {
        this.surname = surname;

        return this;
    }

    public Person withAge(int age) {
        this.age = age;

        return this;
    }

    //
//    @Override
//    public int compareTo(Person o) {
//        int result = withSurname.compareTo(o.withSurname);
//        if (result == 0) {
//            result = withName.compareTo(o.withName);
//        }
//
//        return result;
//    }

    @Override
    public String toString() {
        return "Person{" +
                "withName='" + name + '\'' +
                ", withSurname='" + surname + '\'' +
                ", withAge=" + age +
                '}';
    }
}

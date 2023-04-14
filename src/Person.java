public class Person implements Comparable<Person> {
    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {  // создайте конструктор на все поля
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {    // создайте геттеры и сеттеры
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() { // создайте toString
        return name + " " + surname + " " + age;
    }

    @Override
    public int compareTo(Person o) {
        if (surname.length() < o.surname.length()) {
            return -1;
        } else if (surname.length() > o.surname.length()) {
            return 1;
        } else {
            return Integer.compare(age,o.age);
        }
    }
}

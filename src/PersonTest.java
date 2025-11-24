public class PersonTest {
    static void main() {
        Person person = new Person("yemi", 31, "yemi@gmail.com");

        System.out.println(person.getAge());
        person.setAge(32);
        System.out.println(person.getAge());
    }
}

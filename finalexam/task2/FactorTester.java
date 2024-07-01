package finalexam.task2;

public class FactorTester {
    public static void main(String[] args) {
        PaperFactory factory = new PaperFactory();

        Person person1 = new Person("John", "Doe", "123456");
        Person person2 = new Person("Jane", "Doe", "654321");

        factory.addPerson(person1);
        factory.addPerson(person2);

        System.out.println("Staff List:");
        for (Person p : factory.getStaff()) {
            System.out.println(p);
        }

        factory.deletePerson(person1);

        System.out.println("Staff List after deletion:");
        for (Person p : factory.getStaff()) {
            System.out.println(p);
        }
    }
}


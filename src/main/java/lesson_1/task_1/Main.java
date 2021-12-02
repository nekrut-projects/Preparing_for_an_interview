package lesson_1.task_1;

public class Main {
    public static void main(String[] args) {
        PersonBuilder personBuilder = new PersonBuilder();

        Person person = personBuilder
                .addAddress("address")
                .addAge(50)
                .addFirstName("Bob")
                .addPhone("+7 955 555 55 55")
                .build();

        person.printInfo();
    }
}

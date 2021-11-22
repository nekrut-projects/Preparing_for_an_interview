package lesson_1.task_1;

public class PersonBuilder {
    private String firstName;
    private String lastName;
    private String middleName;
    private String country;
    private String address;
    private String phone;
    private int age;
    private String gender;

    public PersonBuilder addFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public PersonBuilder addLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public PersonBuilder addAddress(String address) {
        this.address = address;
        return this;
    }

    public PersonBuilder addPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public PersonBuilder addAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder addGender(String gender) {
        this.gender = gender;
        return this;
    }

    public PersonBuilder addMiddleName(String middleName) {
        this.middleName = middleName;
        return this;
    }

    public PersonBuilder addCountry(String country) {
        this.country = country;
        return this;
    }

    public Person build(){
        Person person = new Person();
        person.setLastName(lastName);
        person.setAddress(address);
        person.setAge(age);
        person.setCountry(country);
        person.setGender(gender);
        person.setFirstName(firstName);
        person.setMiddleName(middleName);
        person.setPhone(phone);
        return person;
    }
}

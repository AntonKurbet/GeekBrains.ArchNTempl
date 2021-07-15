import lombok.Data;

@Data
class Person {
    private String firstName;
    private String lastName;
    private String middleName;
    private String country;
    private String address;
    private String phone;
    private int age;
    private String gender;

    public Person(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format("%s %s. %s %s %d %s %s %s",
                this.firstName,
                this.middleName,
                this.lastName,
                this.gender,
                this.age,
                this.country,
                this.address,
                this.phone);
    }
}

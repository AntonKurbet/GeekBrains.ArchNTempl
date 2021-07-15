public class DbPersonService implements PersonService {
    @Override
    public Person getPerson(String firstName, String middleName, String lastName) {
        return new Person(firstName, middleName, lastName);
    }
}

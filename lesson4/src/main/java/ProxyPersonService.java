import java.util.HashMap;

public class ProxyPersonService implements PersonService {

    private final DbPersonService personService = new DbPersonService();

    private final HashMap<String, Person> persons = new HashMap<>();

    @Override
    public Person getPerson(String firstName, String middleName, String lastName) {
        String key = String.format("%s %s %s", firstName, middleName, lastName);
        if (persons.containsKey(key)) {
            return persons.get(key);
        } else {
            Person person = personService.getPerson(firstName, middleName, lastName);
            persons.put(key, person);
            return person;
        }
    }
}


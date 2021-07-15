import java.util.HashMap;

public class PersonMapper {
    //emulate DB storage
    private HashMap<Integer, Person> storage;

    public PersonMapper() {
        this.storage = new HashMap<Integer, Person>();
    }

    public Person findById(int idPerson) {
        Person p = storage.get(idPerson);
        if (p == null) throw new RuntimeException("Record not found:" + idPerson);
        return p;
    }

    public void insert(Person person) {
        storage.put(person.getId(), person);
    }

    public void update(Person person) {
        storage.put(person.getId(), person);
    }

    public void delete(Person person) {
        storage.remove(person.getId());
    }
}


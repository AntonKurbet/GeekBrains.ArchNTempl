public class Main {
    public static void main(String[] args) {
        PersonMapper personMapper = new PersonMapper();

        personMapper.insert(new Person(1, "Anton", "Kurbet", "A"));
        Person person = personMapper.findById(1);
        System.out.println("from DB" + person);

        IdentityMap personMap = new IdentityMap(personMapper);
        Person p1 = personMap.retreive(1);
        System.out.println(p1);
        Person p2 = personMap.retreive(1);
        System.out.println("from cache:" + p2);
    }
}

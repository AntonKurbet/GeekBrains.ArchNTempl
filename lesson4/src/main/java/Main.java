public class Main {
    public static void main(String[] args) {
        PersonService personService = new ProxyPersonService();
        Person p = personService.getPerson("Anton", "A", "Kurbet");
        System.out.println(p.toString());
        Person p1 = personService.getPerson("Anton", "A", "Kurbet");
        System.out.println("from cache " + p1.toString());
    }
}

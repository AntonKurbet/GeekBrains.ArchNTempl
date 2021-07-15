public class Main {
    public static void main(String[] args) {
        Person model = new Person("Anton Kurbet", 42);

        PersonView view = new PersonView();

        PersonController controller = new PersonController(model, view);

        controller.updateView();

        controller.setPersonAge(43);

        controller.updateView();
    }
}

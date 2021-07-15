import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
class Person {
    private int id;
    private String firstName;
    private String lastName;
    private String middleName;

    @Override
    public String toString() {
        return String.format("(%d) %s %s. %s",
                this.id,
                this.firstName,
                this.middleName,
                this.lastName);
    }
}

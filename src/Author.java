import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class Author {
    final private String lastName;
    final private String firstName;
    final private String middleName;

    public Author(@NotNull String lastName, @NotNull String firstName, @NotNull String middleName) {
        if (lastName.isBlank()) throw new IllegalArgumentException("Имя указано неверно");
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getMiddleName() {
        return this.middleName;
    }

    @Override
    public String toString() {
        String result = "";
        if (!firstName.isEmpty()) result += "" + firstName.charAt(0) + '.';
        if (!middleName.isEmpty()) result += "" + middleName.charAt(0) + '.';
        if (!result.isEmpty()) {
            result = lastName + ' ' + result;
        } else {
            result = lastName;
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(lastName, author.lastName) && Objects.equals(firstName, author.firstName) && Objects.equals(middleName, author.middleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, firstName, middleName);
    }
}

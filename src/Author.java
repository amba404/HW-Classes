import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class Author {
    final private String lastName;
    final private String firstName;

    public Author(@NotNull String lastName, @NotNull String firstName) {
        if (lastName.isBlank()) throw new IllegalArgumentException("Имя указано неверно");
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        if (!firstName.isEmpty()) result.append(new char[]{firstName.charAt(0), '.'});
        if (!result.isEmpty()) {
            result.insert(0, ' ');
            result.insert(0, lastName);
        } else {
            result.append(lastName);
        }
        return result.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(lastName, author.lastName) && Objects.equals(firstName, author.firstName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, firstName);
    }
}

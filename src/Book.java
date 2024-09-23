import org.jetbrains.annotations.NotNull;

import java.time.LocalDate;

public class Book {
    final private String title;
    final private Author author;
    private int publicationYear;

    public Book(@NotNull String title, @NotNull Author author, int year) {
        if (title.isBlank()) throw new IllegalArgumentException("Неверное название книги");
        this.title = title;
        this.author = author;
        this.publicationYear = year;
    }

    public Author getAuthor() {
        return this.author;
    }

    public String getTitle() {
        return this.title;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        if (publicationYear > LocalDate.now().getYear() + 1) throw new IllegalArgumentException("Неверный год издания");
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return author.toString() + ' ' + title + " -- " + publicationYear + '.';
    }
}

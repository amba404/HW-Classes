public class Book {
    private String title;
    private Author author;
    private int publicationYear;

    public Book(String title, Author author, int year) {
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
        this.publicationYear = publicationYear;
    }
}

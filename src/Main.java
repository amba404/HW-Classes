public class Main {
    public static void main(String[] args) {
        Author tolstoyLN = new Author("Толстой", "Лев", "Николаевич");
        Author pushkinAS = new Author("Пушкин", "Александр", "Сергеевич");
        Book book1 = new Book("Война и мир", tolstoyLN, 1869);
        Book book2 = new Book("Капитанская дочка", pushkinAS, 1837);
        book2.setPublicationYear(1836);
        book1.setPublicationYear(2002);
    }

}
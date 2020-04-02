package Laborator_4.Bookstore;

public class BookstoreCheck {
    public boolean isDubluExemplar(Book book) {

        return false;
    }

    public Book thickestBetween(Book b1, Book b2) {
        return b1.getPageCount() > b2.getPageCount() ? b1 : b2;
    }
}

package Laborator_4.Bookstore;

public class Book {
    private String title;
    private String author;
    private String publisher;
    private int pageCount;

    //ctors
    public Book(){}

    public Book(String title, String author, String publisher, int pageCount) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.pageCount = pageCount;

        if(pageCount == 0) {
            this.pageCount = 1;
        }
    }

    public int getPageCount() {
        return pageCount;
    }

    @Override
    public String toString() {
        return "BOOK_TITLE:" + this.title.toUpperCase() + "\n" +
               "BOOK_AUTHOR:" + this.author + "\n" +
               "BOOK_PUBLISHER:" + this.publisher.toLowerCase() + "\n";
    }
}

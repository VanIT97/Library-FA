package Library.entity;

public class Book {
    private int bookID;
    private String bookName;
    private int bookNumber;
    private String author;
    private int yearPublisher;

    public Book() {
    }

    public Book(int bookID, String bookName, int bookNumber, String author, int yearPublisher) {
        this.bookID = bookID;
        this.bookName = bookName;
        this.bookNumber = bookNumber;
        this.author = author;
        this.yearPublisher = yearPublisher;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookID=" + bookID +
                ", bookName='" + bookName + '\'' +
                ", bookNumber=" + bookNumber +
                ", author='" + author + '\'' +
                ", yearPublisher=" + yearPublisher +
                '}';
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getBookNumber() {
        return bookNumber;
    }

    public void setBookNumber(int bookNumber) {
        this.bookNumber = bookNumber;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearPublisher() {
        return yearPublisher;
    }

    public void setYearPublisher(int yearPublisher) {
        this.yearPublisher = yearPublisher;
    }
}

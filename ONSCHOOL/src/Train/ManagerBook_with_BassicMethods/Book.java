package Train.ManagerBook_with_BassicMethods;

public class Book {
    private String nameBook;
    private double price;
    private int publishingYear;
    private Author author;

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Book(String nameBook, double price, int publishingYear, Author author) {
        this.nameBook = nameBook;
        this.price = price;
        this.publishingYear = publishingYear;
        this.author = author;
    }

    public void printfNameBook() {
        System.out.println(this.nameBook);
    }

    public boolean checkSamePublishingYear(Book otherbook) {
        return this.publishingYear == otherbook.publishingYear;
    }

    public double priceAfftersell(double x) {
        return this.price * (1 - x / 100);
    }
}

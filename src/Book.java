public class Book {
    private String title;
    private Author author;
    private int publishingYear;

    public Book(String title, Author author, int publishingYear) {
        this.title = title;
        this.author = author;
        this.publishingYear = publishingYear;
    }

    public String getTitle() {
        return this.title;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getPublishingYear() {
        return this.publishingYear;
    }

    public void setPublishingYear(int year) {
        this.publishingYear = year;
    }

    public void printInfo() {
        System.out.println("Автор: " + this.author.getFirstName() + " " + this.author.getLastName() +
                ", название: " + this.title + ", год публикации: " + this.publishingYear);
    }
}


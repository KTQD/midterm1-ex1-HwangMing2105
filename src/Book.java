public class Book {
    private String author;
    private int numberOfPages;
    private String genre;

    // Constructor
    public Book(String name, String description, String ID, float price, String author, int numberOfPages, String genre) {
        super(name, description, ID, price);
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.genre = genre;
    }

    // Getter for author
    public String getAuthor() {
        return author;
    }

    // Setter for author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter for numberOfPages
    public int getNumberOfPages() {
        return numberOfPages;
    }

    // Setter for numberOfPages
    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    // Getter for genre
    public String getGenre() {
        return genre;
    }

    // Setter for genre
    public void setGenre(String genre) {
        this.genre = genre;
    }

    // Override method to show info
    @Override
    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Description: " + getDescription());
        System.out.println("ID: " + ID);
        System.out.println("Price: " + price);
        System.out.println("Author: " + author);
        System.out.println("Number of Pages: " + numberOfPages);
        System.out.println("Genre: " + genre);
    }
}

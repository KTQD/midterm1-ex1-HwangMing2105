public class Book {
  private String author;
    private int numberOfPages;
    private String genre;
    public Book (String name, String description, String ID, float price, String author, int num, String genre){
        super(name, description, ID, price);
        this.author = author;
        this.numberOfPages = num;
        this.genre = gen;
    }

    @Override
    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Description: " + getDescription());
        System.out.println("ID: " + ID);
        System.out.println("PRICE " + price);
        System.out.println("Author: " + author);
        System.out.println("numberOfPages: " + numberOfPages);
        System.out.println("Genre: " + genre);
    }
}

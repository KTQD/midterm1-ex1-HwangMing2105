public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng MP3
        MP3 mp3 = new MP3("MP3 Player", "Portable", "MP3001", 49.99f, 240);

        // Tạo đối tượng Book
        Book book = new Book("Java Programming", "Learn Java programming language", "BK1001", 29.99f, "John Doe", 299, "Academic");

        // Hiển thị thông tin của đối tượng MP3
        System.out.println("Information of MP3:");
        mp3.showInfo();
        
        System.out.println();

        // Hiển thị thông tin của đối tượng Book
        System.out.println("Information of Book:");
        book.showInfo();
    }
}


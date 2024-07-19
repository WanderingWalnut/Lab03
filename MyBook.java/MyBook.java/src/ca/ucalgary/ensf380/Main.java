package ca.ucalgary.ensf380;

public class Main {
    public static void main(String[] args) {
        // Create instances of your classes
        Category category = new Category();
        Book book = new Book("123456789", 300);
        Hardcover hardcover = new Hardcover();
        // Set and get values to test
        System.out.println(book.getIsbn());
        System.out.println(book.getPages());
        System.out.println(hardcover.binding());
        // Add more test cases as needed
    }
}

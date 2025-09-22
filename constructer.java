
class Book {
    
    String title;
    String author;
    double price;

  
    Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

   
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

  
    void display() {
        System.out.printl

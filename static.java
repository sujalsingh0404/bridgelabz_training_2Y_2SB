class Book {
    String title;
    int year;
}

class Author extends Book {
    String name;
    String bio;
}

public class Library {
    public static void main(String[] args) {
        Author a = new Author();
        a.title = "Java Book";
        a.year = 2024;
        a.name = "James Gosling";
        a.bio = "He created Java";

        System.out.println("Book: " + a.title);
        System.out.println("Year: " + a.year);
        System.out.println("Author: " + a.name);
        System.out.println("Bio: " + a.bio);
    }
}

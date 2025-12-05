import java.util.*;

public class LibraryCatalog {
    public static void main(String[] args) {
        
        // Map<ISBN, Title>
        Map<String, String> catalog = new HashMap<>();

        // 1. Add books
        catalog.put("978-1234567890", "Java Programming");
        catalog.put("978-0987654321", "Data Structures");
        catalog.put("978-1111111111", "Operating Systems");
        catalog.put("978-2222222222", "Computer Networks");

        System.out.println("Initial Catalog:");
        printSortedCatalog(catalog);

        // 2. Search by ISBN
        System.out.println("\nSearch by ISBN:");
        searchByISBN(catalog, "978-0987654321");
        searchByISBN(catalog, "978-9999999999");

        // 3. Remove a book
        System.out.println("\nRemoving book with ISBN 978-1111111111...");
        catalog.remove("978-1111111111");

        System.out.println("\nCatalog After Removal:");
        printSortedCatalog(catalog);

        // 4. Extended: Search by title
        System.out.println("\nSearch By Title:");
        searchByTitle(catalog, "Computer Networks");
        searchByTitle(catalog, "Database Systems");
    }

    // Print catalog sorted by ISBN
    public static void printSortedCatalog(Map<String, String> catalog) {
        Map<String, String> sorted = new TreeMap<>(catalog);

        for (Map.Entry<String, String> entry : sorted.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    // Search by ISBN
    public static void searchByISBN(Map<String, String> catalog, String isbn) {
        if (catalog.containsKey(isbn)) {
            System.out.println("ISBN: "

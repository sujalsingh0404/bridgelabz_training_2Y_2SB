import java.util.*;

public class InventoryManagement {
    public static void main(String[] args) {

        
        Map<String, Integer> inventory = new HashMap<>();

       
        inventory.put("Apples", 50);
        inventory.put("Bananas", 30);
        inventory.put("Milk", 20);
        inventory.put("Bread", 10);

        System.out.println("Initial Inventory:");
        printInventory(inventory);

       
        sellProduct(inventory, "Bananas", 15);
        sellProduct(inventory, "Milk", 25);
        sellProduct(inventory, "Bread", 10);

        System.out.println("\nAfter Sales:");
        printInventory(inventory);

       
        restockProduct(inventory, "Milk", 40);
        restockProduct(inventor

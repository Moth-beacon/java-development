package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StoreApp {
    public static void main(String[] args) {
        List<Product> inventory = getInventory();
        listAllProducts(inventory);
    }

    public static List<Product> getInventory() {
        List<Product> inventory = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader("inventory.csv"));
            String line;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\|");

                int id = Integer.parseInt(parts[0]);
                String name = parts[1];
                double price = Double.parseDouble(parts[2]);

                Product product = new Product(id, name, price);
                inventory.add(product);
            }

            reader.close();
        } catch (IOException e) {
            System.out.println("Error reading inventory file: " + e.getMessage());
        }

        inventory.sort(Comparator.comparing(Product::getName));

        return inventory;
    }

    public static void listAllProducts(List<Product> products) {
        System.out.println("Sorted Product Inventory:");
        for (Product product : products) {
            System.out.println(product);
        }
    }
}



      /* inventory.add(new Product(197568, "Shirt", 19.99));
        inventory.add(new Product(253457, "'Predator' monitor", 449.99));
        inventory.add(new Product(365098, "'iBuy Power' desktop", 1999.99));
        inventory.add(new Product(490567, "iPhone 15 Pro Max", 1599.99));
        inventory.add(new Product(563542, "HP monitor", 159.99));
        inventory.add(new Product(658032, "Poland Spring water bottle", 0.99));

        return inventory;
    }

    public static void ListAllProducts(List<Product> productsList){
        System.out.println("We carry the following inventory: ");
        for (Product product : productsList) {
            System.out.println(product);
        }
    }
}

*/
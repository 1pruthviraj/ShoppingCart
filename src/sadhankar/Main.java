package sadhankar;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    private static com.sadhankar.Shop shop = new com.sadhankar.Shop();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    shop.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print the choices of options.");
        System.out.println("\t 1 - To check the items in the list.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item from the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit Application.");
    }

    public static void addItem() {
        System.out.println("Please the the grocery item: ");
        shop.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.println("Enter item number: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter replacement item: ");
        String newItem = scanner.nextLine();
        shop.modifyGroceryItem(itemNo-1, newItem);
    }

    public  static void removeItem() {
        System.out.println("Enter item number: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        shop.removeGroceryItem(itemNo);

    }

    public static void searchForItem() {
        System.out.println("Item to search for: ");
        String searchItem = scanner.nextLine();
        if(shop.findItem(searchItem) != null) {
            System.out.println("Found " + searchItem + " in the grocery list");
        } else {
            System.out.println(searchItem + " is not in the shopping list");
        }
    }














}

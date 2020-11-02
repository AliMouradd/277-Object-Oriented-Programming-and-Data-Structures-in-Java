import zybooks_labs.ItemToPurchase;

import java.util.Scanner;

public class ShoppingCartPrinter {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        ItemToPurchase item1 =  new ItemToPurchase();
        System.out.println("Item 1");
        System.out.println("Enter the item name:");
        String item_one_name = scnr.nextLine();
        item1.setItemName(item_one_name);

        System.out.println("Enter the item price:");
        int item_one_price = scnr.nextInt();
        item1.setItemPrice(item_one_price);

        System.out.println("Enter the item quantity:");
        int item_one_quantity = scnr.nextInt();
        item1.setItemQuantity(item_one_quantity);

        System.out.println("");
        scnr.nextLine();

        System.out.println("Item 2");
        ItemToPurchase item2 = new ItemToPurchase();
        System.out.println("Enter the item name:");
        String item_two_name = scnr.nextLine();
        item2.setItemName(item_two_name);

        System.out.println("Enter the item price:");
        int item_two_price = scnr.nextInt();
        item2.setItemPrice(item_two_price);

        System.out.println("Enter the item quantity:");
        int item_two_quantity = scnr.nextInt();
        item2.setItemQuantity(item_two_quantity);

        System.out.println("TOTAL COST");
        System.out.println(item1.getItemName() +" "+item1.getItemQuantity()+" @ $"+item1.getItemPrice()+" "+"= $"+(item1.getItemQuantity()*item1.getItemPrice()));
        System.out.println(item2.getItemName() +" "+item2.getItemQuantity()+" @ $"+item2.getItemPrice()+" "+"= $"+(item2.getItemQuantity()*item2.getItemPrice()));
        System.out.println("Total: $" + ((item1.getItemQuantity()*item1.getItemPrice())+(item2.getItemQuantity()*item2.getItemPrice())));
    }
}
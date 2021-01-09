import java.util.*;

public class McDonalds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        float price;

        int burgersOrdered = 0;
        int drinksOrdered = 0;

        String burgers[] = {"Big Mac", "Triple Cheeseburger", "El Maco", "Double Cheeseburger", "Cheeseburger"};
        String drinks[] = {"Coke", "Sprite", "Orange Juice", "Apple Juice"};

        // Looping forever
        while (true) {
            System.out.println("What would you like to order? ");
            input = sc.nextLine();

            // Ordering burgers
            for (int i = 0; i < burgers.length; i++) {
                if (input.equals(burgers[i])) {
                    System.out.println("Ordered: " + input);
                    burgersOrdered++;
                }
            }

            // Ordering drinks
            for (int i = 0; i < drinks.length; i++) {
                if (input.equals(drinks[i])) {
                    System.out.println("Ordered: " + input);
                    drinksOrdered++;
                }
            }

            // Checking our order
            if (input.equals("order")) {
                System.out.println("Burgers ordered: " + burgersOrdered);
                System.out.println("Drinks ordered: " + drinksOrdered);
            }
        }
    }
}

public class Main {
    ShoppingCart cart = new ShoppingCart();

    public static void main(String[] args) {
        Main run = new Main();
        System.out.println("Shopping cart size: " + run.cart.getSize());
        run.cart.isFull(); //check whether the cart is full
        run.populateCart(); //run populate cart method
        //run.cart.removeLast(); //this method will remove the last element added to the bag.

        run.cart.displayBag();

        System.out.println("Total: " + run.cart.calculatePrice());
        System.out.println("\nConverting to Array!");
        Item[] items = run.cart.toArray();
        for(int i = 0; i < items.length; i++){
            System.out.println("Item " + i + "\n" + items[i].itemToString());
        }

        //test populating 50 items total
        for(int i = 0; i < 4; i ++){
            run.populateCart();
        }
        run.cart.isFull();

    }

    public void populateCart(){ //testAdd method
        cart.add(new Toy("Toy", "Legos", 5.99));
        cart.add(new Toy("Toy", "Cars", 6.99));
        cart.add(new Food("Food", "Banana", 0.89));
        cart.add(new Food("Food", "Strawberries", 2.99));
        cart.add(new BeautyProduct("Beauty Product", "Eyeliner", 15.99));
        cart.add(new Electronic("Electronic", "iPhone", 1099.99));
        cart.add(new Electronic("Electronic", "Batteries", 14.99));
        cart.add(new Food("Food", "Grapes", 3.99));
        cart.add(new Food("Food", "Apples", 6.99));
        cart.add(new Food("Food", "Salmon", 10.99));
    }

}
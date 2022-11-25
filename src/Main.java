public class Main {
    public static void main(String[] args) {

        ShoppingCart shoppingCart = new ShoppingCart();
        System.out.println("Shopping cart size: " + shoppingCart.getCapacity());
        shoppingCart.isFull();
    }
}
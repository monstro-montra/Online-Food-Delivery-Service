public class ShoppingCart implements BagADT{
    //fields

    private int numberOfProducts;
    private final int Default_Capacity = 50;
    private Item[] myBag = new Item[Default_Capacity];

    public ShoppingCart(Item[] bag, int numOfProducts){ //parameterized constructor
        this.myBag = bag;
        this.numberOfProducts = numOfProducts;
    }

    public ShoppingCart(){ //0 args constructor

    }

    //implemented methods

    @Override
    public void add(Object type, int howMany) {


    }

    @Override
    public void discard() {

    }

    @Override
    public int getSize() {
        return myBag.length;
    }

    @Override
    public void toArray() {

    }

    @Override
    public void isFull() {
        if (getCapacity() > getNumberOfProducts()){
            System.out.println("Not full!");
        } else {
            System.out.println("Full!");
        }

    }

    public int getCapacity(){
        return this.Default_Capacity;
    }

    public int getNumberOfProducts() {
        return numberOfProducts;
    }

    public void setNumberOfProducts(int numberOfProducts) {
        this.numberOfProducts = numberOfProducts;
    }
}

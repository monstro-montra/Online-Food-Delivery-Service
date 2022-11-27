import java.util.NoSuchElementException;

public class ShoppingCart implements BagADT{
    //fields
    private int numberOfItems;
    private final int Default_Capacity = 50;
    private Item[] myBag;


    public ShoppingCart(){ //0 args constructor
        numberOfItems = 0; // starting number of products
        myBag = new Item[Default_Capacity]; //initialize myBag data type Parameter of objects at size 50
    }


    //implemented methods
    @Override
    public void add(Object item) {
        myBag[numberOfItems] = (Item) item;
        System.out.println("New item added: " + myBag[numberOfItems].getName());
        numberOfItems++;
        System.out.println("Number of items: " + getNumberOfItems() + "\n");
    }

    @Override
    public Item[] removeLast() { //pops out the last element that was added to the array.
        if (numberOfItems == 0){ //if number of items is <= to 0
            throw new NoSuchElementException(); //throw exception
        }
        System.out.println("Removing " + myBag[numberOfItems - 1].getName());
        Item[] contents = new Item[numberOfItems]; //contents capacity is numberOfItems
        numberOfItems--; //decrement number of elements
        for (int i = 0; i <= numberOfItems; i++){
            contents[i] = myBag[i];
            myBag[i] = contents[i];
            if (i == (numberOfItems)){ //if i = numberOfItems
                myBag[i] = null; //set myBag[i] = to null. this essentially removes the latest addition by making it null.
            }
        }
        System.out.println("Number of items: " + getNumberOfItems() + "\n");

        return myBag; //return myBag
    }

    @Override
    public int getSize() {
        return myBag.length;
    }

    @Override
    public Item[] toArray() {
        Item[] contents = new Item[numberOfItems]; //create new array
        //iterate and increment i by one each time it finds that i < numberOfItems
        //copy element from myBag to contents
        System.arraycopy(myBag, 0, contents, 0, numberOfItems);
        return contents; //return contents array
    }

    @Override
    public void isFull() {
        if (getSize() > getNumberOfItems()){ //if the capacity is > than the numberOfItems
            System.out.println("Not full!\n"); //not full
        } else { //otherwise,
            System.out.println("Full!\n"); //bag is full
        }
    }

    @Override
    public void displayBag() {
        System.out.println("Display Cart");
        for (int i = 0; i < numberOfItems; i++){ //iterate from index 0 to index[numberOfItems]
            System.out.println(myBag[i].itemToString()); //call itemToString method from Item class
        }

    }

    //getters
    public int getNumberOfItems() {
        return numberOfItems;
    }

    //this will calculate price of all items
    public double calculatePrice() { //calculate the total price of myCart
        double totalPrice = 0; //starting totalPrice is 0.
        for (int i = 0; i < numberOfItems; i++) { //loop through the array until the numberOfItems is reached
            double price = myBag[i].getPrice();//set the price = to the price of the current index of current iteration
            totalPrice = totalPrice + price; //set totalPrice = to the totalPrice + the price.
        }
        return totalPrice; //return double value totalPrice

    }

}

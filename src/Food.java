public class Food extends Item{
    public Food(String type, String name, Double price){ //parameterized constructor
        this.setType(type);
        this.setName(name);
        this.setPrice(price);
    }

    public Food() { //0 args constructor.

    }

}

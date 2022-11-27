public class Toy extends Item{

    public Toy(String type, String name, Double price){ //parameterized constructor
        this.setType(type);
        this.setName(name);
        this.setPrice(price);
    }

    public Toy() { //0 args constructor.

    }

}

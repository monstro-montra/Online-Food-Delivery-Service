public class BeautyProduct extends Item{
    public BeautyProduct(String type, String name, Double price){ //parameterized constructor
        this.setType(type);
        this.setName(name);
        this.setPrice(price);
    }

    public BeautyProduct() { //0 args constructor.

    }

}

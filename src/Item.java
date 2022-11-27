abstract class Item {
    private String type; //type of item
    private String name; //name of item
    private double price; //price of item

    //generic getters for all items. if needed, override in subclass.
    public String getType(){
        return this.type;
    }
    public String getName(){
        return this.name;
    }
    public double getPrice(){
        return this.price;
    }

    //generic setters for all items. if needed, override in subclass.
    public void setType(String newType){
        this.type = newType;
    }
    public void setName(String newName){
        this.name = newName;
    }
    public void setPrice(Double newPrice){
        this.price = newPrice;
    }

    public String itemToString(){
        return "Type: " + getType() + "\nName: " + getName() + "\nPrice: " + getPrice() + "\n";
    }
}

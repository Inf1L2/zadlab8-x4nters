package pl.edu.ur.oopl8;

public abstract class Product {

    private double price;
    private String name;
    private String describe;

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getDescribe() {
        return describe;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public Product(double price, String name, String describe) {
        this.price = price;
        this.name = name;
        this.describe = describe;
    }
    

    public abstract void buy();

    public abstract void showInfo();
}
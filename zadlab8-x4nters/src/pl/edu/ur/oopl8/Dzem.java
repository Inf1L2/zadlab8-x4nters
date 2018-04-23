package pl.edu.ur.oopl8;

public class Dzem extends Product {    
    public Dzem(double price, String name, String describe) {
        super(price, name, describe);
    }
    
    public void buy() {
        System.out.println(
                "Kupuje dzem");
    }

    public void showInfo() {
        System.out.println(
                "Cena:" + getPrice()
                + " nazwa:" + getName()
                + " opis:" + getDescribe()
        );
    }
}
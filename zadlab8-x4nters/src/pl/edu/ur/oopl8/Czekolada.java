package pl.edu.ur.oopl8;

public class Czekolada extends Product {    
    public Czekolada(double price, String name, String describe) {
        super(price, name, describe);
    }
    
    public void buy() {
        System.out.println(
                "Kupuje czekolade");
    }

    public void showInfo() {
        System.out.println(
                "Cena:" + getPrice()
                + " nazwa:" + getName()
                + " opis:" + getDescribe()
        );
    }
}
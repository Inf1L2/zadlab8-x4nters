package pl.edu.ur.oopl8;

public class Dlugopis extends Product {    
    public Dlugopis(double price, String name, String describe) {
        super(price, name, describe);
    }
    
    public void buy() {
        System.out.println(
                "Kupuje dlugopis");
    }

    public void showInfo() {
        System.out.println(
                "Cena:" + getPrice()
                + " nazwa:" + getName()
                + " opis:" + getDescribe()
        );
    }
}
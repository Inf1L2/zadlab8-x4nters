package pl.edu.ur.oopl8;

public class Kolo extends FiguraPlaska {
    private float promien;

    public float getPromien() {
        return promien;
    }

    public void setPromien(float promien) {
        this.promien = promien;
    }

    public Kolo(float promien) {
        this.promien = promien;
    }
    
    @Override
    public float obliczObwod(){
        return 2 * 22/7 * promien;
    }
    
    @Override
    public float obliczPole(){
        return 22/7 * promien * promien;
    }
    
    @Override
    public String toString(){
        return "Obliczanie parametrow figury plaskiej" + "\nObwod: " + Float.toString(obliczObwod()) + "\nPole: " + Float.toString(obliczPole());
    }
}

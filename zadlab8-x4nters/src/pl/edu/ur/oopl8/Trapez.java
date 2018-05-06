package pl.edu.ur.oopl8;

public class Trapez extends FiguraPlaska {
    private float dlBokA;
    private float dlBokB;
    private float wysokosc;

    public float getDlBokA() {
        return dlBokA;
    }

    public float getDlBokB() {
        return dlBokB;
    }

    public float getWysokosc() {
        return wysokosc;
    }

    public void setDlBokA(float dlBokA) {
        this.dlBokA = dlBokA;
    }

    public void setDlBokB(float dlBokB) {
        this.dlBokB = dlBokB;
    }

    public void setWysokosc(float wysokosc) {
        this.wysokosc = wysokosc;
    }

    public Trapez(float dlBokA, float dlBokB, float wysokosc) {
        this.dlBokA = dlBokA;
        this.dlBokB = dlBokB;
        this.wysokosc = wysokosc;
    }
    
    @Override
    public float obliczObwod(){
        return dlBokA + dlBokB; //
    }
    
    @Override
    public float obliczPole(){
        return 1 / 2 * (dlBokA + dlBokB) * wysokosc;
    }
    
    @Override
    public String toString(){
        return "Obliczanie parametrow figury plaskiej" + "\nObwod: " + Float.toString(obliczObwod()) + "\nPole: " + Float.toString(obliczPole());
    }
}

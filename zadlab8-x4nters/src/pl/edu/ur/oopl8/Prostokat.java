package pl.edu.ur.oopl8;

public class Prostokat extends FiguraPlaska {
    private float dlBokuA;
    private float dlBokuB;

    public float getDlBokuA() {
        return dlBokuA;
    }

    public float getDlBokuB() {
        return dlBokuB;
    }

    public void setDlBokuA(float dlBokuA) {
        this.dlBokuA = dlBokuA;
    }

    public void setDlBokuB(float dlBokuB) {
        this.dlBokuB = dlBokuB;
    }

    public Prostokat(float dlBokuA, float dlBokuB) {
        this.dlBokuA = dlBokuA;
        this.dlBokuB = dlBokuB;
    }
    
    @Override
    public float obliczObwod(){
        return (2 * dlBokuA) + (2 * dlBokuB);
    }
    
    @Override
    public float obliczPole(){
        return dlBokuA * dlBokuB;
    }
    
    @Override
    public String toString(){
        return "Obliczanie parametrow figury plaskiej" + "\nObwod: " + Float.toString(obliczObwod()) + "\nPole: " + Float.toString(obliczPole());
    }
}

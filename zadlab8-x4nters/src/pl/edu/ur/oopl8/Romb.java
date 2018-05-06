package pl.edu.ur.oopl8;

public class Romb extends FiguraPlaska {
    private float dlPrzekatnaA;
    private float dlPrzekatnaB;

    public float getDlPrzekatnaA() {
        return dlPrzekatnaA;
    }

    public float getDlPrzekatnaB() {
        return dlPrzekatnaB;
    }

    public void setDlPrzekatnaA(float dlPrzekatnaA) {
        this.dlPrzekatnaA = dlPrzekatnaA;
    }

    public void setDlPrzekatnaB(float dlPrzekatnaB) {
        this.dlPrzekatnaB = dlPrzekatnaB;
    }

    public Romb(float dlPrzekatnaA, float dlPrzekatnaB) {
        this.dlPrzekatnaA = dlPrzekatnaA;
        this.dlPrzekatnaB = dlPrzekatnaB;
    }
    
    @Override
    public float obliczObwod(){
        return 4 * ((1/2*dlPrzekatnaA * 1/2*dlPrzekatnaA) + (1/2*dlPrzekatnaB * 1/2*dlPrzekatnaB));
    }
    
    @Override
    public float obliczPole(){
        return (1/2 * dlPrzekatnaA * dlPrzekatnaB);
    }
    
    @Override
    public String toString(){
        return "Obliczanie parametrow figury plaskiej" + "\nObwod: " + Float.toString(obliczObwod()) + "\nPole: " + Float.toString(obliczPole());
    }
}

package pl.edu.ur.oopl8;

public class Prostopaloscian extends FiguraPrzestrzenna {
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

    public Prostopaloscian(float dlBokA, float dlBokB, float wysokosc) {
        this.dlBokA = dlBokA;
        this.dlBokB = dlBokB;
        this.wysokosc = wysokosc;
    }
    
    @Override
    public float obliczObjetosc(){
        return dlBokA * dlBokB * wysokosc;
    }
    
    @Override
    public float obliczPole(){
        return 2 * (dlBokA * dlBokB) + 2 * (dlBokA * wysokosc) + 2 * (dlBokB * wysokosc);
    }
    
    @Override
    public String toString(){
        return "Obliczanie parametrow figury przestrzennej" + "\nObjetosc: " + Float.toString(obliczObjetosc()) + "\nPole: " + Float.toString(obliczPole());
    }
}

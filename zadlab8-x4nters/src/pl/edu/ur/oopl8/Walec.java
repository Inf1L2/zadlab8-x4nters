package pl.edu.ur.oopl8;

public class Walec extends FiguraPrzestrzenna {
    private float promien;
    private float wysokosc;

    public float getPromien() {
        return promien;
    }

    public float getWysokosc() {
        return wysokosc;
    }

    public void setPromien(float promien) {
        this.promien = promien;
    }

    public void setWysokosc(float wysokosc) {
        this.wysokosc = wysokosc;
    }

    public Walec(float promien, float wysokosc) {
        this.promien = promien;
        this.wysokosc = wysokosc;
    }
    
    @Override
    public float obliczObjetosc(){
        return 22/7 * promien * promien * wysokosc;
    }
    
    @Override
    public float obliczPole(){
        return (2 * 22/7 * promien * promien) + (2 * 22/7 * promien * wysokosc);
    }
    
    @Override
    public String toString(){
        return "Obliczanie parametrow figury przestrzennej" + "\nObjetosc: " + Float.toString(obliczObjetosc()) + "\nPole: " + Float.toString(obliczPole());
    }
}

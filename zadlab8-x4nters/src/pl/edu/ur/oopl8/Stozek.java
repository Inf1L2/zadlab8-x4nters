package pl.edu.ur.oopl8;

public class Stozek extends FiguraPrzestrzenna {
    private float promien;
    private float tworzaca;
    private float wysokosc;

    public float getPromien() {
        return promien;
    }

    public float getTworzaca() {
        return tworzaca;
    }

    public float getWysokosc() {
        return wysokosc;
    }

    public void setPromien(float promien) {
        this.promien = promien;
    }

    public void setTworzaca(float tworzaca) {
        this.tworzaca = tworzaca;
    }

    public void setWysokosc(float wysokosc) {
        this.wysokosc = wysokosc;
    }

    public Stozek(float promien, float tworzaca, float wysokosc) {
        this.promien = promien;
        this.tworzaca = tworzaca;
        this.wysokosc = wysokosc;
    }
    
    @Override
    public float obliczObjetosc(){
        return 1/3 * 22/7 * promien * promien * wysokosc;
    }
    
    @Override
    public float obliczPole(){
        return (22/7 * promien * promien) + (22/7 * promien * tworzaca);
    }
    
    @Override
    public String toString(){
        return "Obliczanie parametrow figury przestrzennej" + "\nObjetosc: " + Float.toString(obliczObjetosc()) + "\nPole: " + Float.toString(obliczPole());
    }
}

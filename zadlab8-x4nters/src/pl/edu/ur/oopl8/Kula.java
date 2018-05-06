package pl.edu.ur.oopl8;

public class Kula extends FiguraPrzestrzenna {
    private float promien;

    public float getPromien() {
        return promien;
    }

    public void setPromien(float promien) {
        this.promien = promien;
    }

    public Kula(float promien) {
        this.promien = promien;
    }
    
    @Override
    public float obliczObjetosc(){
        return 4/3 * 22/7 * promien * promien * promien;
    }
    
    @Override
    public float obliczPole(){
        return 4 * 22/7 * promien * promien;
    }
    
    @Override
    public String toString(){
        return "Obliczanie parametrow figury przestrzennej" + "\nObjetosc: " + Float.toString(obliczObjetosc()) + "\nPole: " + Float.toString(obliczPole());
    }
}

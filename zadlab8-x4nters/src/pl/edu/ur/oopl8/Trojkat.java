package pl.edu.ur.oopl8;

public class Trojkat extends FiguraPlaska {
    private float dlPodstawy;
    private float wysokosc;

    public float getDlPodstawy() {
        return dlPodstawy;
    }

    public float getWysokosc() {
        return wysokosc;
    }

    public void setDlPodstawy(float dlPodstawy) {
        this.dlPodstawy = dlPodstawy;
    }

    public void setWysokosc(float wysokosc) {
        this.wysokosc = wysokosc;
    }

    public Trojkat(float dlPodstawy, float wysokosc) {
        this.dlPodstawy = dlPodstawy;
        this.wysokosc = wysokosc;
    }
    
    @Override
    public float obliczObwod(){
        return dlPodstawy; //
    }
    
    @Override
    public float obliczPole(){
        return 1 / 2 * dlPodstawy * wysokosc;
    }
    
    @Override
    public String toString(){
        return "Obliczanie parametrow figury plaskiej" + "\nObwod: " + Float.toString(obliczObwod()) + "\nPole: " + Float.toString(obliczPole());
    }
}

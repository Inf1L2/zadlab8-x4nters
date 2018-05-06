package pl.edu.ur.oopl8;

public class Szescian extends FiguraPrzestrzenna {
    private float dlBoku;

    public float getDlBoku() {
        return dlBoku;
    }

    public void setDlBoku(float dlBoku) {
        this.dlBoku = dlBoku;
    }

    public Szescian(float dlBoku) {
        this.dlBoku = dlBoku;
    }
    
    @Override
    public float obliczObjetosc(){
        return dlBoku * dlBoku * dlBoku;
    }
    
    @Override
    public float obliczPole(){
        return 6 * (dlBoku * dlBoku);
    }
    
    @Override
    public String toString(){
        return "Obliczanie parametrow figury przestrzennej" + "\nObjetosc: " + Float.toString(obliczObjetosc()) + "\nPole: " + Float.toString(obliczPole());
    }
}

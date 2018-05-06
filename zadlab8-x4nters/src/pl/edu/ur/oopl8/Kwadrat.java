package pl.edu.ur.oopl8;

public class Kwadrat extends FiguraPlaska {
    private float dlBoku;

    public float getDlBoku() {
        return dlBoku;
    }

    public void setDlBoku(float dlBoku) {
        this.dlBoku = dlBoku;
    }

    public Kwadrat(float dlBoku) {
        this.dlBoku = dlBoku;
    }
    
    @Override
    public float obliczObwod(){
        return 4 * dlBoku;
    }
    
    @Override
    public float obliczPole(){
        return dlBoku * dlBoku;
    }
    
    @Override
    public String toString(){
        return "Obliczanie parametrow figury plaskiej" + "\nObwod: " + Float.toString(obliczObwod()) + "\nPole: " + Float.toString(obliczPole());
    }
}

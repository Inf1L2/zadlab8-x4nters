package pl.edu.ur.oopl8;

public abstract class FiguraPrzestrzenna extends FiguraGeometryczna {
    public abstract float obliczObjetosc();
    
    @Override
    public String toString(){
        return "Obliczanie parametrow figury przestrzennej";
    }
}

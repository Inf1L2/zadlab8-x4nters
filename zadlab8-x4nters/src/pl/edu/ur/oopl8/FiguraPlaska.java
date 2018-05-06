package pl.edu.ur.oopl8;

public abstract class FiguraPlaska extends FiguraGeometryczna {
    public abstract float obliczObwod();
    
    @Override
    public String toString(){
        return "Obliczanie parametrow figury plaskiej";
    }
}

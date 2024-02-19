package lib;
public class fraccion {
    private int numerador;
    private int denominador;

    public fraccion(){
        this.numerador = 1;
        this.denominador = 1;
    }

    public fraccion(int nummetes, int denmetes){
        this.numerador = nummetes;
        this.denominador = denmetes;
    }
    
    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }
    
    public void invertir() {
        int guardar = this.denominador;
        this.denominador = numerador;
        this.numerador = guardar;        
    }

    public void multiplicar(fraccion fraccion2) {
        this.numerador *= fraccion2.numerador;
        this.denominador *= fraccion2.denominador;
    }

    // Método para dividir la fracción por otra fracción dada
    public void dividir(fraccion fraccion2) {
        this.numerador = this.numerador * fraccion2.denominador;
        this.denominador = this.denominador * fraccion2.numerador;
    }
}

public class Circulo extends Figura {
    int Radio;

    public Circulo(int Radio){
        this.Radio=Radio;
    }

    public double area(){
        return (Math.PI * Radio * Radio);
    }
    public double perimetro(){
        return (Math.PI * 2 * Radio);
    } 

}

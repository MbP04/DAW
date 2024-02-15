public class Cuadrado extends Figura{
    int Lado;

    public Cuadrado(int Lado){
        this.Lado=Lado;
    }

    public double area(){
        return (Lado*Lado);
    }

    public double perimetro(){
        return (4*Lado);
    } 

}

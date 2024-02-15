public class Triangulo extends Figura{
    int Altura;
    int Base;
    
    public Triangulo(int Base, int Altura){
        this.Altura=Altura;
        this.Base=Base;
    }

    public double area(){
        return ((Base*Altura)/2);
    }

    public double perimetro(){
        
        return (Base + 2*Math.sqrt((Base*Base)/4 + (Altura * Altura)));
    } 
}
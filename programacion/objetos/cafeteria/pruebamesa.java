import lib.mesa;
public class pruebamesa {
    public static void main(String[] args) {
        mesa miMesa = new mesa();
        System.out.println(miMesa.getColor());

        miMesa.setColor("Amarillo");
        System.out.println("Nuevo color: " + miMesa.getColor());    
        System.out.println("Area: "+miMesa.area());
        System.out.println("-----");
        
        mesa otraMesa = new mesa ("Azul", 3 , 50, 60, "Acero");
        System.out.println("Otro color: "+ otraMesa.getColor());
        System.out.println("Area: "+otraMesa.area());
        System.out.println("Area m: "+otraMesa.area("m"));
        System.out.println("Area in: "+otraMesa.area("in"));
        System.out.println("Area x: "+otraMesa.area("x"));
    }   
}
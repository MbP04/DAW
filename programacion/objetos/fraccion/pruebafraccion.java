import lib.fraccion;

public class pruebafraccion {
    public static void main(String[] args) {
        // Crear una fracción con valores iniciales
        fraccion fraccion = new fraccion(3,7);
        fraccion otraFraccion = new fraccion(2, 5);

        System.out.println("Fracción original: " + fraccion.getNumerador() + "/" + fraccion.getDenominador());
        
        // Crear una fracción con ortos datos
        fraccion.invertir();
        System.out.println("Fracción modificada: " + fraccion.getNumerador() + "/" + fraccion.getDenominador());

        // Multiplicar la fracción por 2
        fraccion.multiplicar(otraFraccion);
        System.out.println("Fracción multiplicada: " + fraccion.getNumerador() + "/" + fraccion.getDenominador());

        // Dividir la fracción por 3
        fraccion.dividir(otraFraccion);
        System.out.println("Fracción dividida : " + fraccion.getNumerador() + "/" + fraccion.getDenominador());
    }
}

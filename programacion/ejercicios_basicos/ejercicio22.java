class ejercicio22{
	public static void main(String[] args){
		short edad;
		int codigoPostal;
		double altura;
		double peso;
		char genero1;
		char genero2;
		String nombre;
		int numHijos;
		byte iva;
		double precio;
		String mensaje;
		int minuto;
		int dia;
		String matriculaCoche;
		long contador; 
		boolean mayorDeEdad; 
		String tallaCamiseta;
		
		edad = 19;
		codigoPostal = 46900;
		altura = 1.84;
		peso = 60.3;
		genero1 = 'M';
		genero2 = 'H';
		nombre = "Marc Burguera";
		numHijos = 3;
		iva = 33;
		precio = 16.54;
		mensaje = "Buenos dias familia, un saludo";
		minuto = 54;
		dia = 10;
		matriculaCoche = "1548FGK";
		contador = 10111213141516L;
		mayorDeEdad = false;
		tallaCamiseta = "XL";
		
		System.out.println("Edad: "+edad); 
		System.out.println("Codigo Postal: "+codigoPostal); 
		System.out.println("Altura: "+altura); 
		System.out.println("Peso: "+peso+"kg"); 
		System.out.println("Genero "+genero2+": Hombre, "+genero1+": Mujer");
		System.out.println("Nombre: "+nombre); 
		System.out.println("Hijos: "+numHijos); 
		System.out.println("IVA: "+iva+"%"); 
		System.out.println("Precio: "+precio+"EUR"); 
		System.out.println("Mensaje: "+mensaje); 
		System.out.println("Minuto: "+minuto); 
		System.out.println("Dia: "+dia+" de Diciembre"); 
		System.out.println("Matricula: "+matriculaCoche); 
		System.out.println("Contador: "+contador); 
		System.out.println("Mayor de edad: "+mayorDeEdad); 
		System.out.println("Talla de camiseta: "+tallaCamiseta); 
	}
}
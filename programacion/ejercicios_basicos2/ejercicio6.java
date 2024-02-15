class ejercicio6 {
	public static void main(String[] args){
		String string = "Marc Burguera Paredes";
		String[] partes = string.split(" ");
		String nom = partes[0]; 
		String ape1 = partes[1]; 
		String ape2 = partes[2]; 
		
		int cnom = nom.length();
		int cape1 = ape1.length();
		int cape2 = ape2.length();
		
		System.out.println("Caracteres del nombre: "+nom+" = "+cnom);
		System.out.println("Caracteres del primer apellido: "+ape1+" = "+cape1);
		System.out.println("Caracteres del segundo apellido: "+ape2+" = "+cape2);
	}
}
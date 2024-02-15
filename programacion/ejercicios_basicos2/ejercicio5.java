class ejercicio5 {
	public static void main(String[] args){
		String string = "Marc Burguera Paredes";
		String[] partes = string.split(" ");
		String nom = partes[0]; 
		String ape1 = partes[1]; 
		String ape2 = partes[2]; 
		
		System.out.println(nom);
		System.out.println(ape1);
		System.out.println(ape2);
		
	}
}
class ejercicio33{
	public static void main(String[] args){
		char c1 = 'E';
		char c2 = '5';
		char c3 = '?';
		
		//Para pasar un numero entero/caracter a ASCII
		//int res = (int) c1;
		//System.out.println(+res);
		
		System.out.println("====== a) =====");
		
		int res = (int) c1 + 1;
		System.out.println(+res);

		
		System.out.println("====== b) =====");
		
		int res2 = (int) c1-c2+c3;
		System.out.println(res2);
		
		System.out.println("====== c) =====");
		
		int res3 = (int) c1-2;
		System.out.println(res3);
		
		System.out.println("====== d) =====");
		
		int res4 = (int) c2-'2';
		System.out.println(res4);
		
		System.out.println("====== e) =====");
		
		int res5 = (int) c3+'#';
		System.out.println(res5);
		
		System.out.println("====== f) =====");
		
		int res6 = (int) '2'+'2';
		System.out.println(res6);
		
		System.out.println("====== g) =====");
		
		int res7 = (int) 3*c2;
		System.out.println(res7);
		
		System.out.println("====== h) =====");
		
		int res8 = (int) '3'*c2;
		System.out.println(res8);	
		
	}
}
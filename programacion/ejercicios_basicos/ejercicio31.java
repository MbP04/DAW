class ejercicio31{
	public static void main(String[] args){
		int a = 8;
		int b = 3;
		int c = -5;
		
		System.out.println("====== a) =====");
		
		int res = a+b+c;
		System.out.println(res);
		
		System.out.println("====== b) =====");
		
		int res2 = 2*b+3*(a-c);
		System.out.println(res2);
		
		System.out.println("====== c) =====");
		
		int res3 = a/b;
		System.out.println(res3);
		
		System.out.println("====== d) =====");
		
		int res4 = a % b;
		System.out.println(res4);
		
		System.out.println("====== e) =====");
		
		int res5 = a/c;
		System.out.println(res5);
		
		System.out.println("====== f) =====");
		
		int res6 = a%c;
		System.out.println(res6);
		
		System.out.println("====== g) =====");
		
		int res7 = a*b/c;
		System.out.println(res7);
		
		System.out.println("====== h) =====");
		
		int res8 = a*(b/c);
		System.out.println(res8);
		
		System.out.println("====== i) =====");
		
		int res9 = a*c%b;
		System.out.println(res9);
		
		System.out.println("====== j) =====");
		
		int res10 = (a - 3 * b) % (c + 2 * a) / (a - c);
		System.out.println(res10);
		
		System.out.println("====== k) =====");
		
		int res11 = a-b-c*2;
		System.out.println(res11);
	}
}
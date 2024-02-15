class ejercicio51{
	public static void main(String[] args){
				
		//Variables 
		int i = 8;
		int j = 5;
		float x = 0.005f;
		float y = -0.01f;
		char c = 'c';
		char d = 'd';
		
		System.out.println ("======= a) ========");
		
		boolean res = !(c == 99);
		System.out.println(res);
		
		
		System.out.println ("======= b) ========");
		
		boolean res2 = !(x > 0);
		System.out.println(res2);
		
		System.out.println ("======= c) ========");
		
		boolean res3 = c > d || c > 0;
		System.out.println(res3);
		
		System.out.println ("======= d) ========");
		
		boolean res4 = i <= j && i >= c;
		System.out.println(res4);
		
		System.out.println ("======= e) ========");
		
		boolean res5 = i > 0 && j < 5;
		System.out.println(res5);
		
		System.out.println ("======= f) ========");
		
		boolean res6 = i > 0 || j < 5;
		System.out.println(res6);
		
		System.out.println ("======= g) ========");
		
		boolean res7 = x > y && i > 0 || j < 5;
		System.out.println(res7);
				
		
		
	}
	
		
	
}
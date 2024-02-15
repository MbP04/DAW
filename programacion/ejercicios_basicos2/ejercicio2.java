class ejercicio2 {
	public static void main(String[] args){
		float a = 8.0f;
		int b = 3;
		char c = '5';	
		
		System.out.println("===== a) =====");
		
		int resint = (int) (a - b + c);
		double resdouble = (int) (a - b + c);
		System.out.println("a - b + c = "+(a - b + c)+ " resint = "+resint+" resdouble = "+resdouble);
		
		
		System.out.println("===== b) =====");
		
		int resint2 = (int) (2 * b + 3 * (a - c));
		double resdouble2 = (double) (2 * b + 3 * (a - c));
		System.out.println("2 * b + 3 * (a - c)= "+(2 * b + 3 * (a - c))+ " resint = "+resint2+" resdouble = "+resdouble2);
		
		System.out.println("===== c) =====");
		
		int resint3 = (int) a / b;
		double resdouble3 =  a / b;
		System.out.println("a/b= "+(a / b)+ " resint = "+resint3+" resdouble = "+resdouble3);
		
		System.out.println("===== d) =====");
		
		int resint4 = (int) a % b;
		double resdouble4 = a % b;
		System.out.println("a%b= "+(a % b)+ " resint = "+resint4+" resdouble = "+resdouble4);
		
		System.out.println("===== e) =====");
		
		int resint5 = (int) (a / c - 2);
		double resdouble5 = a / c - 2;
		System.out.println("a / c - 2= "+(a / c - 2)+ " resint = "+resint5+" resdouble = "+resdouble5);
		
		System.out.println("===== f) =====");
		
		int resint6 = (int) (a * b / c);
		double resdouble6 = a * b / c;
		System.out.println("a * b / c= "+(a * b / c)+ " resint = "+resint6+" resdouble = "+resdouble6);
				
		System.out.println("===== g) =====");
		
		int resint7 = (int) (a * (c % b));
		double resdouble7 = a * (c % b);
		System.out.println("a * (c % b)= "+(a * (c % b))+ " resint = "+resint7+" resdouble = "+resdouble7);
		
		System.out.println("===== h) =====");
		
		int resint8 = (int) ((3 * a - 2 * b) % (2 * a - c));
		double resdouble8 = ((3 * a - 2 * b) % (2 * a - c));
		System.out.println("(3 * a - 2 * b) % (2 * a - c)= "+(3 * a - 2 * b) % (2 * a - c)+ " resint = "+resint8+" resdouble = "+resdouble8);
		
		System.out.println("===== i) =====");
		
		int resint9 = (int) ((a - 3 * b) % (c + 2 * a) / (a - c));
		double resdouble9 = ((a - 3 * b) % (c + 2 * a) / (a - c));
		System.out.println("(a - 3 * b) % (c + 2 * a) / (a - c)= "+(a - 3 * b) % (c + 2 * a) / (a - c)+ " resint = "+resint9+" resdouble = "+resdouble9);
		
		System.out.println("===== j) =====");
		
		int resint10 = (int) a - b - c * 2;
		double resdouble10 = a - b - c * 2;
		System.out.println("a - b - c * 2= "+(a - b - c * 2)+ " resint = "+resint10+" resdouble = "+resdouble10);
		
		
		
		
		
		
		
		
		
	}
}
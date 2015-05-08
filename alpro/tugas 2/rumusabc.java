public class rumusabc{
	public static void main(String[] args){
		double a = 2;
		double b = 1000;
		double c = 16;
		double D = b*b - 4*a*c;
		double x1, x2   ;
		System.out.println("Persamaan kuadrat a*x^2+b*x+c=0, di mana");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("dengan menerapkan rumus ABC diketahui bahwa: ");

	if(D<0){
		System.out.println("Akar-akar persamaan imaginer.");
	}else
	if(D==0){
		System.out.println("Akar-akar persamaan nyata tetapi kembar.");
		x1 = -b/(2*a);
		System.out.println("x1 = x2 = " + x1);
	}else{
		System.out.println("Akar-akar persamaan nyata dan berbeda.");
		x1 = (-b+Math.sqrt(D))/(2*a);
		x2 = (-b-Math.sqrt(D))/(2*a);
		System.out.println("x1 = " + x1 + "+ln"+"   x2 = " + x2);
		}
	}

}

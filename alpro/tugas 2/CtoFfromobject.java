public class CtoFfromobject{
	double convert_CtoF (double celcius){
		double fahrenheit = (celcius*9.0/5.0)+32;
		return fahrenheit;
	}
	public static void main(String[]args){
		CtoFfromobject ctof = new CtoFfromobject();
		double c = 35.0;
		double f = ctof.convert_CtoF (c);
		System.out.println(c+" derajat celcius setara dengan "+f+" derajat fahrenheit");
	}
}
		
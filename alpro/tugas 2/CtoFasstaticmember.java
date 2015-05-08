public class CtoFasstaticmember {
	static double convert_CtoF (double celcius){
		double fahrenheit = (celcius*9.0/5.0)+32;
		return fahrenheit;
	}
	public static void main(String[]args){
		double c = 35.0;
		double f =convert_CtoF (c);
		System.out.println(c+"derajat cecius setara dengan "+f+" derajat fahrenheit");
	}
}

	
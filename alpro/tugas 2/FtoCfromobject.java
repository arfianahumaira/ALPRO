public class FtoCfromobject {
	double convert_FtoC (double fahrenheit){
		double celcius = (fahrenheit-32)*5.0/9.0;
		return celcius;
	}
	public static void main(String[]args){
		FtoCfromobject ftoc = new FtoCfromobject();
		double f = 95.0;
		double c = ftoc.convert_FtoC (f);
		System.out.println(f+"derajat fahrenheit setara dengan "+c+" derajat celcius");
	}
}

	
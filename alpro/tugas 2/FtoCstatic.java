class FtoCstring{
	double convert_FtoC(double fahrenheit) {
		double celcius = (fahrenheit -32) * (5.0/9.0);
		return celcius;
	}
	public static void main(String[] args) {
		FtoCstring ftoc = new FtoCstring();
		double f = Double.parseDouble(args[0]);
		double c = ftoc.convert_FtoC(f);
		System.out.println(f + " derajat Fahrenheit setara dengan " + c + " derajat Celcius");
	}
}
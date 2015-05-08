class CtoFstring{
	double convert_CtoF(double celcius) {
		double fahrenheit = (celcius*9.0/5.0)+32.0;
		return fahrenheit;
	}
	public static void main(String[]args){
	CtoFstring ctof = new CtoFstring();
	double c = Double.parseDouble(args[0]);
	double f = ctof.convert_CtoF(c);
	System.out.println(c + " derajat Celcius setara dengan " + f + " derajat fahrenheit");
	}
}

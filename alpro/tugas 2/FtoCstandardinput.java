import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class FtoCstandardinput {
	static double convert_FtoC(double fahrenheit) {
		double celcius = (fahrenheit -32) * (5.0/9.0);
		return celcius;
	}

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Masukkan temperatur dalam derajat Fahrenheit, diikuti Enter: ");
		try {
			String inputFahrenheit = br.readLine();
			double f = Double.parseDouble(inputFahrenheit);
			double c = convert_FtoC(f) ;
			System.out.println(f + " derajat Fahrenheit setara dengan " + c + " derajat Celcius");

		} catch (IOException iox) {
			iox.printStackTrace();
		} catch (NumberFormatException nfex) {
			System.out.println("Masukan yang anda berikan tidak dalam format angka.");
		}
	}
}
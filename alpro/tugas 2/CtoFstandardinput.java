import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class CtoFstandardinput {
	static double convert_CtoF(double celcius) {
		double fahrenheit = (celcius*9.0/5.0)-32;
		return fahrenheit;
	}

	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Masukkan temperatur dalam derajat Celcius, diikuti menekan enter: ");
		try{
			String inputCelcius = br.readLine();
			double c = Double.parseDouble(inputCelcius);
			double f = convert_CtoF(c);
			System.out.println(c+"derajat celcius setara dengan"+f+"derajat fahrenheit");
	
		} catch (IOException iox){
			iox.printStackTrace();
		} catch (NumberFormatException nfex){
			System.out.println("Masukan yang adnda berikan tidak dalam format angka");
		}
	}
}
	
import java.util.Scanner;
public class bola{
public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	double phi = 3.14;
	double r, volume;
		System.out.print("Masukkan Panjang Jari-jari : ");
	r = input.nextDouble();
	volume = 4/3*phi*r*r*r;
		System.out.print("volume bola adalah "+volume);
}
}
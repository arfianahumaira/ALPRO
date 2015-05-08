public class Kuadratpangkattiga{
	public static void main(String[]args){
	System.out.println("angka\t\tkuadrat\t\tpangkat tiga");

	for (int angka = 0; angka <= 10; angka++) {
		double kuadrat = Math.pow(angka, 2);
		double pangkatTiga = Math.pow(angka, 3);
		System.out.print(angka + "\t\t");
		System.out.print(kuadrat + "\t\t");
		System.out.println(pangkatTiga);
		}
	}
}
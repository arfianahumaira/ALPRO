public class Bataa {
	public static void main(String[]args) {
		String genap = "xxxx	xxxx	xxxx	xxxx	xxxx";
		String ganjil ="    xxxx    xxxx    xxxx    xxxx	";
	for(int baris=0; baris<10 ;++baris){
		if((baris/2)==(baris%2)=0){
		System.out.println(genap);
		}
		else{
		System.out.println(ganjil);
			}
		}
	}
}
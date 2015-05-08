public class Piramid {
	public static void main(String[]args){
		for(int baris=0; baris<10; baris++){
		for(int spasi=baris; spasi<10; spasi++){
			System.out.print("  ");
		}
		for(int bata=0; bata<=(baris*2); bata++){
			System.out.print("XX");
		}
		System.out.println();
		}
	}
}
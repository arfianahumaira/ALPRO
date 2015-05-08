public class Bata {
	public static void main(String[]args){
		String genap = "[==][==][==][==][==][==][==][==][==][==]";
		String ganjil = "=][==][==][==][==][==][==][==][==][==][=";
		for(int baris=0; baris<10; baris++){
		if((baris%2)==0){
		System.out.println(genap);
		}	
		else{
		System.out.println(ganjil);
			}
		}
	}	
}
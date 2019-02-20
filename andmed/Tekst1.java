public class Tekst1{
	public static void main(String[] arg){
		String lause="Juku tuli kooli";
		System.out.println(lause.length());
		System.out.println(lause.charAt(0));
		if(lause.charAt(0)=='J'){
			System.out.println("Algab J-iga");			
		}
		if(lause.substring(0, 2).equals("Ju")){
			System.out.println("Algab Ju-iga");						
		}
		//Kuva lause iga täht eraldi real
		for(int i=0; i<lause.length(); i++){
			System.out.println(lause.charAt(i));
		}
	}
}
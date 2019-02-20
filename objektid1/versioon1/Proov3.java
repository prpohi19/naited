import java.util.Scanner;
public class Proov3{
	public static void main(String[] arg){
		Tegelane juku=new Tegelane();
		Tegelane kati=new Tegelane();
		juku.liigu();
		kati.muudaSuund(Suund.YLES);
		kati.liigu();
		System.out.println(juku);
		System.out.println(kati);
		System.out.println(juku.kaugus(kati));
		Scanner lugeja=new Scanner(System.in);
		System.out.println("Palun Juku suund: ");
		String sisend=lugeja.nextLine();
		if(sisend.equals("v")){
			
		}
	}
}
/*
  Harjutus: 
  Koostage programm kahe tegelasega, kes algul teineteisest mõne sammu kaugusel. Programm hakkab kordamööda küsima, et millises suunas kumbki liigub. Enterivajutusel liigutakse samas suunas edasi.
  Iga sammu järgi kuvatakse kummagi tegelase koordinaadid. Kui teineteisega samale ruudule satutakse, lõpeb mäng.
  if(sisend.equals("v")){}
*/
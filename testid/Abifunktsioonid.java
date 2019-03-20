public class Abifunktsioonid{
	public static double geomKeskmine(double[] arvud){		
		//Kohendage funktsiooni, et ta töötaks ka arvutus2-testiga
		if(arvud.length==2){return Math.sqrt(arvud[0]*arvud[1]);}
		if(arvud.length==3){
			return Math.pow(arvud[0]*arvud[1]*arvud[2], 1.0/3);}
		return -1;
		//Tee funktsioon ümber nii, et see toimiks arvude suvalise kogusega
	}
}
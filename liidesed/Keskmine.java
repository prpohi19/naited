public class Keskmine implements Algoritm{
	public double arvuta(double[] arvud){
		double summa=0;
		for(int i=0; i<arvud.length; i++){
			summa+=arvud[i];
		}
		return summa/arvud.length;
	}
}
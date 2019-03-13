public class LihtneArvutaja implements Arvutaja{
	 public double arvuta(Algoritm algoritm, ArvudeLugeja lugeja){
		 return algoritm.arvuta(lugeja.loeArvud());
	 }
}
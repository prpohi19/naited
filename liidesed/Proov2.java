public class Proov2{
	public static void main(String[] arg) throws Exception{
		ArvudeLugeja lugeja1=new TekstifailistArvujadaLugeja("arvud1.txt");
		Algoritm a1=new Keskmine();
		Arvutaja arvutaja1=new LihtneArvutaja();
		double vastus=arvutaja1.arvuta(a1, lugeja1);
		System.out.println(vastus);
	}
}
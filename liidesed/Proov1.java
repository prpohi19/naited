public class Proov1{
	public static void main(String[] arg){
		MalustLugeja lugeja1=new MalustLugeja();
		lugeja1.lisa(5);
		lugeja1.lisa(7);
		Algoritm a1=new Keskmine();
		Arvutaja arvutaja1=new LihtneArvutaja();
		double vastus=arvutaja1.arvuta(a1, lugeja1);
		System.out.println(vastus);
		lugeja1.lisa(9);
		System.out.println(arvutaja1.arvuta(a1, lugeja1));
	}
}
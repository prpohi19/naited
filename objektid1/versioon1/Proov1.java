public class Proov1{
	public static void main(String[] arg){
		Tegelane juku=new Tegelane();
		juku.liigu();
		juku.muudaSuund(Suund.YLES);
		System.out.println(juku);
		juku.liigu();
		juku.liigu();
		System.out.println(juku);
	}
}
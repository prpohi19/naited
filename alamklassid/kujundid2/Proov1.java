public class Proov1{
	public static void main(String[] arg){
		RuumilineKujund k1=new Risttahukas(6, 5, 3);
		System.out.println(k1.ruumala());
		System.out.println(k1.taisPindala());
		//Lisage klass Silinder
		//Looge klassist kaks eksemplari (r=2, h=5; r=4, h=3)
		//Kuvage kummagi silindri põhja pindala, 
		//põhja ümbermõõt, külgpindala, täispindala ja ruumala
		Silinder s1=new Silinder(2, 5);
		System.out.println(s1.taisPindala());
	}
}
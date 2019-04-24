public class Proov2{
	public static void main(String[] arg){
		RuumilineKujund k1=new Risttahukas(3, 4, 5);
	    System.out.println(k1 instanceof Silinder);
		System.out.println(VarviArvutused.varviKulu(k1, 0.5));
		RuumilineKujund[] m={k1, new Silinder(5, 10), new Silinder(2, 5) };
		System.out.println(VarviArvutused.varviKulu(m, 0.5));
        System.out.println(VarviArvutused.silindrid(m).size());	
		//Kuva Ruumiliste Kujundite loetelust kõige suurem silindri raadius
		//Kuva loetlust kõige suurema raadiusega silindri ruumala
		System.out.println(VarviArvutused.silindritestSuurimaRuumala(m));
	}
}
import java.util.*;
public class Proov2{
	public static void main(String[] arg){
		Paar<String, Integer> isik1=
		   new Paar<String, Integer>("Juku", 2004);
		System.out.println(2019-isik1.teine);
		List<Paar<String,Integer>> isikud=
		  new ArrayList<Paar<String,Integer>>();
		isikud.add(isik1);
		isikud.add(new Paar<String, Integer>(
		  "Kati", 2005
		));
		System.out.println(isikud.get(1).esimene);
	}
}
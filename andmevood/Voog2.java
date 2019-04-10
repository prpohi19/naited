import java.util.*;
public class Voog2{
	public static String esitaht(String sona){
		return sona.substring(0, 1);
	}
	public static boolean algabJiga(String sona){
		return sona.startsWith("J");
	}
	public static void main(String[] arg){
		Arrays.asList("Juku", "Kati", "Juhan", "Mati").
		  stream().
		  filter(new Alguskontrollija("K")::kontrolli).
		  //filter(Voog2::algabJiga).
		  //map(s -> s.substring(0, 1)).
		  map(Voog2::esitaht).
		  forEach(System.out::println);
	}
}
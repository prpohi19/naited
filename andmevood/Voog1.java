import java.util.*;
public class Voog1{
	public static void main(String[] arg){
	   System.out.println(
		Arrays.asList("Juku", "Kati", "Juhan", "Mati").
		  stream().filter(s -> s.startsWith("J")).
		  mapToDouble(s -> s.length()).average().getAsDouble());
		  //forEach(System.out::println);
	}
}
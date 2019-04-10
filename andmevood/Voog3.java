import java.util.*;
public class Voog3{
	public static void main(String[] arg){
	   System.out.println(
		Arrays.asList("Juku", "Mai", "Juhan", "Mai", "Johannes").
		  stream().
		   //anyMatch(s -> s.length()>6)
		   //distinct().count()
		   //filter(s -> s.length()<1).
		   //findFirst().orElse("puudub")
		   limit(3).count()
		  );		  
	}
}
import java.util.*;
import java.util.stream.*;
import java.nio.file.*;
public class Voog7{
	public static void main(String[] arg) throws Exception{
	   Map<String, List<String>> grupid=
 		Files.readAllLines(Paths.get("isikud2.txt")).
		 stream().collect(Collectors.groupingBy(s -> s.split(",")[2]));
	   for(String sugu: grupid.keySet()){
		   System.out.println(sugu+": "+grupid.get(sugu).stream().
		     mapToInt(s -> Integer.parseInt(s.split(",")[1])).
			   average().getAsDouble());
	   }
	}
}
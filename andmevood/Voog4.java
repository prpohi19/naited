import java.util.*;
import java.nio.file.*;
public class Voog4{
	public static void main(String[] arg) throws Exception{
	   System.out.println(
		Files.readAllLines(Paths.get("isikud1.txt")).
		 stream().
		 mapToInt(s -> Integer.parseInt(s.split(",")[1])).max().getAsInt());
	}
}
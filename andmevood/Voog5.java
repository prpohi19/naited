import java.util.*;
import java.util.stream.*;
import java.nio.file.*;
public class Voog5{
	public static int pikkus(String s){
		return Integer.parseInt(s.split(",")[1]);
	}
	public static void main(String[] arg) throws Exception{
	   System.out.println(
		Files.readAllLines(Paths.get("isikud1.txt")).
		 stream().
		 //sorted().
		 sorted((s1, s2) -> pikkus(s1)-pikkus(s2)).
		 collect(Collectors.toList()));
	}
}
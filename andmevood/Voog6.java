import java.util.*;
import java.util.stream.*;
import java.nio.file.*;
import java.io.*;
public class Voog6{
	public static void main(String[] arg) throws Exception{
		PrintWriter pw=new PrintWriter(new FileWriter("vastus1.txt"));
		Files.readAllLines(Paths.get("isikud1.txt")).
		 stream().
		 sorted().
		 forEach(pw::println);
		pw.close();
	}
}
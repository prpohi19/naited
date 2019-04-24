import java.util.*;
import java.util.stream.*;
public class Voog10{
	public static void main(String[] arg){
		System.out.println(IntStream.rangeClosed(1,5).
		  reduce((a, b) -> (a>b) ? a : b));
	}
}
import java.util.*;
import java.util.stream.*;
public class Voog9{
	public static void main(String[] arg){
		//System.out.println(IntStream.generate(new Arvulooja1()).limit(5).sum());
		System.out.println(Arrays.toString(
		  IntStream.generate(new Arvulooja2(5)).
		  skip(3).limit(5).toArray()));
	}
}
import java.io.*;
import java.util.*;
public class Failid2{
	public static void main(String[] arg) throws Exception{
		BufferedReader lugeja=new BufferedReader(new FileReader("eesnimed.txt"));
		List<String> hoidla=new ArrayList<String>();
		String rida=lugeja.readLine();
		while(rida!=null){
			hoidla.add(rida);
			rida=lugeja.readLine();
		}
		Collections.sort(hoidla);
		PrintWriter kirjutaja=new PrintWriter(new FileWriter("vastus1.txt"));
		for(String eesnimi: hoidla){
			kirjutaja.println(eesnimi.length()+" "+eesnimi);			
		}
		kirjutaja.close();
	}
}
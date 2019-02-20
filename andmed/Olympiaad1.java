import java.io.*;
import java.util.*;
public class Olympiaad1{
	static boolean kasSobib(String muster, String sona){
		if(muster.length()!=sona.length()){return false;}
		for(int i=0; i<muster.length(); i++){
			if(muster.charAt(i)!=sona.charAt(i)){
				if(muster.charAt(i)!='*'){return false;}
			}
		}
		return true;
	}
	public static void main(String[] arg) throws Exception{
	   BufferedReader lugeja=new BufferedReader(new FileReader("tekstsis.txt"));
	   int kogus=Integer.parseInt(lugeja.readLine());
	   String[] m=new String[kogus];
	   for(int i=0; i<kogus; i++){
		   m[i]=lugeja.readLine();
	   }
	   String vordlus=lugeja.readLine();
	   List<String> vastused=new ArrayList<String>();
	   for(int i=0; i<kogus; i++){
		   if(kasSobib(vordlus, m[i])){
			   vastused.add(m[i]);
		   }
	   }
	   PrintWriter kirjutaja=new PrintWriter(new FileWriter("tekstval.txt"));
	   kirjutaja.println(vastused.size());
	   for(int i=0; i<vastused.size(); i++){
		   kirjutaja.println(vastused.get(i));
	   }
	   kirjutaja.close();
	}
}
import java.io.*;
import java.net.*;
import java.util.*;

public class Lugemine2{
	public static void main(String[] arg) throws Exception{
		Hashtable<String, TekstiAndmed> hoidla=new Hashtable<>();
		BufferedReader lugeja=new BufferedReader(
		   new InputStreamReader(new URL("http://www.tlu.ee/~jaagup/andmed/keel/kunglarahvas_lambipirn_pikkused_haalikud.txt").openStream())
		);
		System.out.println(lugeja.readLine());
		String rida=lugeja.readLine();
		while(rida!=null){
			String[] m=rida.split(",");
			if(hoidla.get(m[0])==null){
			   hoidla.put(m[0], new TekstiAndmed());	
			}
			hoidla.get(m[0]).sonadeArv++;
			hoidla.get(m[0]).sonapikkusteSumma+=Integer.parseInt(m[2]);
			rida=lugeja.readLine();
		}
		lugeja.close();
		System.out.println(hoidla.get("kungla").keskmineSonapikkus());
		for(String lugu: hoidla.keySet()){
			System.out.println(lugu+" - sõnu: "+hoidla.get(lugu).sonadeArv);
		}
	}
}
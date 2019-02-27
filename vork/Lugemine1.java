import java.io.*;
import java.net.*;
public class Lugemine1{
	public static void main(String[] arg) throws Exception{
		BufferedReader lugeja=new BufferedReader(
		   new InputStreamReader(new URL("http://www.tlu.ee/~jaagup/andmed/keel/kunglarahvas_lambipirn_pikkused_haalikud.txt").openStream())
		);
		System.out.println(lugeja.readLine());
		String rida=lugeja.readLine();
		while(rida!=null){
			String[] m=rida.split(",");
			if(m[0].equals("kungla")){
			  System.out.println(m[1]+": "+m[2]);
			}
			rida=lugeja.readLine();
		}
		lugeja.close();
		//Leia kummagi teksti sõnade arv
		//Leia kummagi teksti sõnade keskmine tähtede arv
	}
}
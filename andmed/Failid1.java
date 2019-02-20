import java.io.*;
public class Failid1{
	public static void main(String[] arg) throws Exception{
		BufferedReader lugeja=new BufferedReader(new FileReader("eesnimed.txt"));
		String rida=lugeja.readLine();
		while(rida!=null){
			System.out.println(rida.length()+" "+rida);
			rida=lugeja.readLine();
		}
	}
}
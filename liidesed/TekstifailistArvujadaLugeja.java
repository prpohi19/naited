import java.io.*;
public class TekstifailistArvujadaLugeja implements ArvudeLugeja{
	MalustLugeja m=new MalustLugeja();
	public TekstifailistArvujadaLugeja(String failinimi) throws IOException{
		BufferedReader lugeja=new BufferedReader(new FileReader(failinimi));
		String rida=lugeja.readLine();
		while(rida!=null){
			m.lisa(Double.valueOf(rida));
			rida=lugeja.readLine();
		}
		lugeja.close();
	}
	public double[] loeArvud(){
		return m.loeArvud();
	}
} //Koostage näide failist lugeja kasutamiseks
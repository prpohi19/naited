import java.util.*;
public class MalustLugeja implements ArvudeLugeja{
	List<Double> hoidla=new ArrayList<Double>();
	public void lisa(double arv){
		hoidla.add(arv);
	}
	public double[] loeArvud(){
		//Teisendab List<Double> tüübiks double[]
		return hoidla.stream().mapToDouble(arv -> arv.doubleValue()).toArray();
	}
}
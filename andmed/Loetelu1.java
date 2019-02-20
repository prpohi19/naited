import java.util.*;
public class Loetelu1{
	public static void main(String[] arg){
		List<String> eesnimed=new ArrayList<String>();
		eesnimed.add("Juku");
		eesnimed.add("Kati");
		eesnimed.add("Mati");
		System.out.println(eesnimed.size());
		System.out.println(eesnimed.get(2));
		eesnimed.add(1, "Madis");
		System.out.println(eesnimed);
		System.out.println(eesnimed.remove(eesnimed.size()-1));
		System.out.println(eesnimed);		
	}
}
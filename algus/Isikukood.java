public class Isikukood{
	String kood;
	public Isikukood(String uusKood){
		kood=uusKood;
	}
	String kysiSugu(){
		if(Integer.parseInt(kood.substring(0, 1)) % 2 == 0){
			return "N";
		}
		return "M";
	}
}
public class Alguskontrollija{
	String algus;
	public Alguskontrollija(String uusAlgus){
		algus=uusAlgus;
	}
	public boolean kontrolli(String sona){
		return sona.startsWith(algus);
	}
}
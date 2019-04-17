public class Proov1{
	public static <T> void trykiMassiiv(T[] m){
		for(T e:m){
			System.out.println(e);
		}
	}
	public static <T> String tekstiks(T[] m){
		StringBuilder sb=new StringBuilder();
		boolean algus=true;
		for(T e : m){
			if(!algus){sb.append(", ");}
			sb.append(e);
			algus=false;
		}
		return sb.toString();
	}
	//Koostage funktsioon, mis võtaks vastu suvalist 
	//tüüpi massiivi ning tagastaks elementidest
	//toString - käsuga tulevad tekstid
	//komadega eraldatuna
	public static void main(String[] arg){
		System.out.println(
		  tekstiks(new String[]{"Juku", "Kati"}));
		trykiMassiiv(new String[]{"Juku", "Kati"});
		trykiMassiiv(new Integer[]{1, 4, 9});
	}
}
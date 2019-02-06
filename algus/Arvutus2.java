public class Arvutus2{
	
	public static double leiaTakistus(double voimsus, double pinge){
		return pinge/leiaVool(voimsus, pinge);
	}
	
	public static double leiaVool(double voimsus, double pinge){
		return voimsus/pinge;
	}
	
	public static void main(String[] arg){
		System.out.println(leiaVool(30, 220));
		System.out.println(leiaTakistus(30, 220));
	}
}

/*

[jaagup@greeny algus]$ java Arvutus2
0.13636363636363635
1613.3333333333335

*/
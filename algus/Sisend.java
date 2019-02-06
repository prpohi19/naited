public class Sisend{
	public static void main(String[] argumendid){
		System.out.println("Argumente: "+argumendid.length);
		for(int i=0; i<argumendid.length; i++){
			System.out.println(argumendid[i]);
		}
		int summa=0;
		for(int i=0; i<argumendid.length; i++){
			System.out.println(argumendid[i].substring(0, 1)+" "+
			  argumendid[i].length());
		   summa+=argumendid[i].length();
		}
		//Kuvage argumentides olevate sõnade tähtede arvu summa
		System.out.println(summa);
	}
}
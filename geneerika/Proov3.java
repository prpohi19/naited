public class Proov3{
	public static void main(String[] arg){
		LoendamisegaPuu<String> puu1=new LoendamisegaPuu<>();
		puu1.lisa("Juku tuli kooli".split(" "));
		puu1.lisa("Juku jooksis koju".split(" "));
		System.out.println(puu1.juur.loendur);
		System.out.println(puu1.juur.kysi("Juku"));
		System.out.println(puu1.juur.
		  kysi("Juku").kysi("tuli").loendur);
		System.out.println(puu1.juur.alampuuString());
	}
}
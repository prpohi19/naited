public class Proov4{
	public static void main(String[] arg){
		LoendamisegaPuu<Integer> puu1=new LoendamisegaPuu<>();
		puu1.lisa(new Integer[]{1, 3, 1, 3, 4, 2, 2});
		puu1.lisa(new Integer[]{1, 3, 5, 5, 5, 4, 2, 7});
		puu1.lisa(new Integer[]{5, 3, 5, 3, 5, 5});
		System.out.println(puu1.juur.alampuuHTML()); 
    }
}
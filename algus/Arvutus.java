public class Arvutus{
	public static void main(String[] arg){
		int vanus=6;
		if(arg.length==1){
		  try{
			vanus=Integer.parseInt(arg[0]);
		  } catch(Exception ex){
			  System.out.println(arg[0]+ " pole arv");
		  }
		}
		if(vanus<7){
			System.out.println("Tasuta");
		} else {
			if(vanus<18){
				System.out.println("Lapsepilet");
			} else {
				System.out.println("Täispilet");
			}
		}
		for(int nr=0; nr<vanus; nr++){
			System.out.println("Õnne!");
		}
	}
}
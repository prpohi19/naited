public class Sisend2{
	public static void main(String[] arg){
		Isikukood jaagup=new Isikukood("37605030299");
		Isikukood toomas=new Isikukood("50804250357");
		System.out.println(jaagup.kysiSugu());
		System.out.println(toomas.kysiSugu());
	}
}
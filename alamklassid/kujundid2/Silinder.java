public class Silinder extends RuumilineKujund{
	double r;
	public Silinder(double raadius, double korgus){
		super(korgus);
		r=raadius;
	}
	public double pohjaPindala(){
		return Math.PI*r*r;
	}
	public double pohjaYmbermoot(){
		return 2*Math.PI*r;
	}
	public double kysiRaadius(){
		return r;
	}
}
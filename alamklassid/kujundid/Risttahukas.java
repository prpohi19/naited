public class Risttahukas extends RuumilineKujund{
	double pikkus, laius;
	public Risttahukas(double pikkus, double laius, double korgus){
		super(korgus);
		this.pikkus=pikkus; this.laius=laius;
	}
	@Override
	public double pohjaPindala(){
		return pikkus*laius;
	}
}
public abstract class RuumilineKujund{
	double korgus;
	public RuumilineKujund(double korgus){
		this.korgus=korgus;
	}
	abstract double pohjaPindala();
	public double ruumala(){
		return pohjaPindala()*korgus;
	}
}
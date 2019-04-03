public abstract class RuumilineKujund{
	double korgus;
	public RuumilineKujund(double korgus){
		this.korgus=korgus;
	}
	abstract double pohjaPindala();
	abstract double pohjaYmbermoot();
	public double ruumala(){
		return pohjaPindala()*korgus;
	}	
	public double kylgPindala(){
		return pohjaYmbermoot()*korgus;
	}
	public double taisPindala(){
		return kylgPindala()+2*pohjaPindala();
	}
}
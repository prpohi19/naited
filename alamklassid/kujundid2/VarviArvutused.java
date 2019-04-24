import java.util.*;
public class VarviArvutused{
	static double varviKulu(RuumilineKujund k, double paksusMm){ //Kuupsentimeetrites
		return k.taisPindala()*paksusMm*0.1;
	}
	//Koosta funktsioon, mis saab parameetriks Ruumiliste kujundite massiivi
	//ja värvi paksuse ning
	//tagastab kujundite massiivi värvimiseks kulunud värvi koguse
	static double varviKulu(RuumilineKujund[] kujundid, double paksusMm){
		double summa=0;
		for(RuumilineKujund k:kujundid){
			summa+=varviKulu(k, paksusMm);
		}
		return summa;
	}
	static List<Silinder> silindrid(RuumilineKujund[] kujundid){
		List<Silinder> vastus=new ArrayList<Silinder>();
		for(RuumilineKujund k: kujundid){
			if(k instanceof Silinder){
				Silinder s=(Silinder)k;
				vastus.add(s);
			}
		}
		return vastus;
	} 
	
	static double silindritestSuurimaRuumala(RuumilineKujund[] kujundid){
		List<Silinder> slist=silindrid(kujundid);
		if(slist.size()==0){return -1;}
		Silinder suurim=slist.get(0);
		for(Silinder s: slist){
			if(s.ruumala()>suurim.ruumala()){suurim=s;}
		}
		return suurim.ruumala();
	}
}
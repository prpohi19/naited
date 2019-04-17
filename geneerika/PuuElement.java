import java.util.*;
class PuuElement<T>{
	T sisu;
    int loendur=0;
	Set<PuuElement<T>> lapsed=new HashSet<>();
	PuuElement<T> lisa(T laps){
		if(kysi(laps)==null){
			PuuElement<T> uus=new PuuElement<T>();
			uus.sisu=laps;
			lapsed.add(uus);
		}
		PuuElement<T> uuritav=kysi(laps);
		uuritav.loendur++;
		return uuritav;
	}
	PuuElement<T> kysi(T laps){
		for(PuuElement<T> e : lapsed){
			if(e.sisu.equals(laps)){return e;}
		}
		return null;
	}
	public String toString(){
		return ((sisu==null) ? "." : sisu.toString())+
		   ": "+loendur;
	}
	public String alampuuString(){
		String vastus=toString()+"(";
		for(PuuElement<T> e : lapsed){
			vastus+=e.alampuuString();
		}
		return vastus+")";
	}
	//Koostage funktsioon alampuu kuvamiseks <ul> ja <li>
	//elementide abil
	public String alampuuHTML(){
		String vastus=toString();
		if(lapsed.size()>0){
	     vastus+="<ul>";
		 for(PuuElement<T> e : lapsed){
			vastus+="<li>"+e.alampuuHTML()+"</li>";
		 }
		 vastus+="</ul>";
		}
		return vastus;
	}
}
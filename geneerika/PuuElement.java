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
}
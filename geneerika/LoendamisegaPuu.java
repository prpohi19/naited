import java.util.*;
public class LoendamisegaPuu<T>{
    PuuElement<T> juur=new PuuElement<T>();
	void lisa(T[] m){
		juur.loendur++;
		PuuElement<T> jooksev=juur;
		for(int koht=0; koht<m.length; koht++){
			jooksev=jooksev.lisa(m[koht]);
		}
	}
}
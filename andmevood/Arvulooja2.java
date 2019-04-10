import java.util.function.*;
public class Arvulooja2 implements IntSupplier{
	int nr=0;
	int samm;
	public Arvulooja2(int uusSamm){samm=uusSamm;}
	public int getAsInt(){
		nr+=samm;
		return nr;
	}
}

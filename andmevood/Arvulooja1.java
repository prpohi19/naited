import java.util.function.*;
public class Arvulooja1 implements IntSupplier{
	int nr=0;
	public int getAsInt(){
		nr+=2;
		return nr;
	}
}

//Koosta uus arvulooja, kus määratakse konstruktoris ette, 
//mitme kaupa arvud suurenevad
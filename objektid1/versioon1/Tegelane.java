class Tegelane{
	int x, y;
	Tyyp tyyp;
	public Tegelane(){
		x=0; y=0;
		tyyp=Tyyp.MANGIJA;
	}
	public String toString(){
		return tyyp+" kohal "+x+", "+y;
	}
}
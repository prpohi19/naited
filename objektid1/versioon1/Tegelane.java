class Tegelane{
	int x, y;
	Tyyp tyyp;
	Suund suund;
	public Tegelane(){
		x=0; y=0;
		tyyp=Tyyp.MANGIJA;
		suund=Suund.PAREMALE;
	}
	public void liigu(){
		if(suund==Suund.PAREMALE){x++;} //Lisage ka muud suunad
	}
	public void muudaSuund(Suund uusSuund){suund=uusSuund;}
	public String toString(){
		return tyyp+" kohal "+x+", "+y+" suunaga "+suund;
	}	
}

//Koostage ENUM Suund väärtustega PAREMALE, YLES, VASAKULE, ALLA
//Koostage Tegelasele Suund-tüüpi muutuja algväärtusega PAREMALE
//Kuva suund toString-käskluses välja
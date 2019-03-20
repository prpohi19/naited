import org.junit.*;
import static org.junit.Assert.*;

public class Kontroll1{
	@Test
	public void esimene(){
		System.out.println("Testi automaatkäivitus");
	}
	@Test
	public void arvutus1(){
	   assertEquals(6, Abifunktsioonid.geomKeskmine(new double[]{4, 9}), 0.001);
	}
	@Test
	public void arvutus2(){
	   assertEquals(3, Abifunktsioonid.geomKeskmine(new double[]{1, 3, 9}), 0.001);
	}
	//Lisa test viie arvu geomeetrilise keskmise leidmiseks
	@Test
	public void arvutus3(){
	   assertEquals(2, Abifunktsioonid.geomKeskmine(new double[]{1, 1, 1, 4, 8}), 0.001);
	}
	@Test(expected=ArithmeticException.class)
	public void arvutus4(){
	    Abifunktsioonid.geomKeskmine(new double[]{});
	}
	@Test(expected=ArithmeticException.class)
	public void arvutus5(){
	    Abifunktsioonid.geomKeskmine(null);
	}
	@Test
	public void proov2(){
	   assertNull(null);
	}
}

/*
[jaagup@greeny testid]$ javac -cp junit4.jar:. Kontroll1.java
[jaagup@greeny testid]$ java -cp junit4.jar:. org.junit.runner.JUnitCore Kontroll1
JUnit version 4.8.2
.Testi automaatkäivitus

Time: 0.009

OK (1 test)

*/
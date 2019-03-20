import org.junit.*;
import static org.junit.Assert.*;

public class Kontroll1{
	@Test
	public void esimene(){
		System.out.println("Testi automaatkäivitus");
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
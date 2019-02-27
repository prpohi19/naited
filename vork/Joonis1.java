import java.awt.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;
public class Joonis1{
	public static void main(String[] arg) throws Exception{
		BufferedImage bi=new BufferedImage(400, 300, BufferedImage.TYPE_INT_RGB);
		Graphics g=bi.createGraphics();
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, 400, 300);
		g.setColor(Color.RED);
		g.drawLine(100, 80, 100, 150);
		g.drawLine(100, 150, 130, 220);
		g.drawLine(100, 150, 70, 220);
		//Lisage käed
		g.fillRect(130, 220, 15, 10);
		//Lisage teine saabas
		g.drawOval(85, 50, 30, 30);
		//Lisage silmad
		g.setColor(Color.BLACK);
		g.drawString("Juku", 90, 250);
		ImageIO.write(bi, "png", new File("pilt1.png"));
	}
}
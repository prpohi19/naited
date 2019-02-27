import java.awt.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;
import java.net.*;
public class Joonis3{
	public static void main(String[] arg) throws Exception{
	    BufferedReader lugeja=new BufferedReader(
		   new InputStreamReader(new URL("http://www.tlu.ee/~jaagup/andmed/keel/kunglarahvas_lambipirn_pikkused_haalikud.txt").openStream())
		);
		lugeja.readLine();
		BufferedImage bi=new BufferedImage(800, 800, BufferedImage.TYPE_INT_RGB);
		Graphics g=bi.createGraphics();
		g.setColor(Color.WHITE);
		int koef=100;
		int veel=500;
		while(veel>0){
			String[] m=lugeja.readLine().split(",");
		  if(m[0].equals("lambipirn")){
			g.drawString(m[1], 
			  koef*Integer.parseInt(m[3]), 
			  koef+koef*Integer.parseInt(m[4])+(int)(koef/1.2*Math.random()));
			  veel--;
		  }
		}
		ImageIO.write(bi, "png", new File("pilt1.png"));
		//Koostage sarnane joonis lambipirni loost viiekümne sõnaga
	}
}
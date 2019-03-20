import java.util.*;
public class Vurrud1{
	public static int[] ylevaade(int[] m){
		Arrays.sort(m);
		int[] vastus=new int[5];
		vastus[0]=m[0];
		vastus[4]=m[m.length-1];
		vastus[1]=m[m.length/4];
		vastus[2]=m[m.length/2];
		vastus[3]=m[m.length*3/4];
		return vastus;
	}
	public static String AsciiKarpDiagramm(int[] arvud){
		//char[][] v=new char[5, 80];
		StringBuffer sb=new StringBuffer();
		for(int rida=0; rida<5; rida++){
			for(int veerg=0; veerg<60; veerg++){
				char symbol=' ';
				if(rida==0 && veerg==arvud[2]){symbol='*';}
				if((rida==1 || rida==3) && 
				   (veerg>=arvud[1] && veerg<=arvud[3])){symbol='*';}
				if((rida==2) && 
				  ((veerg>=arvud[0] && veerg<=arvud[1]) || 
				   (veerg>=arvud[3] && veerg<=arvud[4]))){symbol='*';}
				if(rida==4 && veerg==arvud[2]){symbol='*';}
				//v[rida][veerg]=symbol;
				sb.append(symbol);
			}
			sb.append("\n");
		}
		return sb.toString();
	}
	public static void main(String[] arg){
		System.out.println(Arrays.toString(
	      ylevaade(new int[]{7, 8, 4, 5, 4, 3, 4, 6, 7, 8, 7, 8, 1, 9})));
		System.out.println(AsciiKarpDiagramm(ylevaade(new int[]{7, 8, 4, 5, 4, 3, 4, 6, 7, 8, 7, 8, 1, 9})));
	}
}
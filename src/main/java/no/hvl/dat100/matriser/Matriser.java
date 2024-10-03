package no.hvl.dat100.matriser;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {

	for(int enkelTabell[] : matrise) {
		for(int enkelTall : enkelTabell) {
			System.out.print
					(enkelTall);
		}}
		
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String tekst = "";
		int i;

	for(int enkelTabell[] : matrise) {
		tekst += "\n";
		for( i = 0 ; i < enkelTabell.length; i++) {
			tekst += enkelTabell[i] + " ";
		}
	}//System.out.print(tekst);
	return tekst;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		if (matrise == null || tall == 0) {
			return null;}
		
		int rader = matrise.length;
		int koloner = matrise[0].length;
		
		int nyMatrise[][] = new int [rader][koloner];
		
		for (int i = 0; i < rader; i++)	{
			for (int b = 0; b < koloner; b++) {
				nyMatrise[i][b] = matrise[i][b]*tall;
			}
		}return nyMatrise;
		
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
	int i = 0;
	
		if (a==null || b==null) {
			return false;
		}
		
	
		if (a.length != b.length) {
			return false;
		}
		for (i = 0; i < a.length; i++) {
			if(a.length != b.length) {
				return false;
			}
		}
		
		for (i = 0; i < a.length; i++)	{
			for (int j = 0; j < a[i].length; j++) 
				if (a[i][j] != b[i][j]) {
					return false;}	
			
		
	}
		return true;}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO

		throw new UnsupportedOperationException("Metoden speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden multipliser ikke implementert");
	
	}
}

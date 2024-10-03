package no.hvl.dat100.tabeller;



public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		System.out.print("[");
		for (int i = 0; i < tabell.length; i++) {
			System.out.print(tabell[i] + " ");
		}

		System.out.println("]");

	}

	// b)
	public static String tilStreng(int[] tabell) {

		int i = 0;
		String utskrift = "[";

		for (i = 0; i < tabell.length; i++) {
			utskrift += tabell[i];

			if (i < tabell.length - 1) {
				utskrift += ",";
			}
		}
		utskrift += "]";
		System.out.println(utskrift);
		return utskrift;

	}

	// c)
	public static int summer(int[] tabell) {

		int a = 0;
		for (int i = 0; i < tabell.length; i++) {
			a += tabell[i];
		}

		return a;

	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		int i = 0;

		boolean finnes = false;
		while (i < tabell.length && finnes != true) {

			if (tabell[i] == tall) {
				finnes = true;

			} else {
				i++;
			}

		}
		return finnes;

	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		int i = 0;
		int posisjon = -1;
		boolean finnes = false;
		
		while (i < tabell.length && !finnes)
			if (tabell[i]==tall) {
			finnes = true;
			posisjon = i;
		}
		
			else {
			i++;
		}
	
		
		return posisjon;
	
	}

	// f)
	public static int[] reverser(int[] tabell) {
		
		
		int[] tabell2 = new int[tabell.length];
		int n = tabell.length-1;
		
		for (int i = 0 ; i<tabell.length; i++) {
			
			
			int nyTabel = tabell[i];
			tabell2[n] = nyTabel;
			
			--n;	

		}
		return tabell2;
	} 

	// g)
	public static boolean erSortert(int[] tabell) {

		int i = 0;
		int n = 1;
		boolean rekkeFølge = false;
		
		if(tabell.length <= 1) {
			rekkeFølge = true;
		}
		
		while(i<tabell.length && !rekkeFølge) {
		if (tabell[i]<tabell[n]) {
			i++;
			n++;
			if(n==tabell.length) {
			rekkeFølge = true;}
		}
		else {
			i += tabell.length;
			rekkeFølge = false;
		}
		
			
		}
		return rekkeFølge;
		
		}
	

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int [] tabellSammen = new int[tabell1.length + tabell2.length];
		
		for (int i = 0 ; i < tabell1.length; i++) {
			tabellSammen[i] = tabell1[i];
		}
		for (int i = tabell1.length; i < (tabell1.length + tabell2.length); i++) {
			tabellSammen[i] = tabell2[i-tabell1.length];
	}
		return tabellSammen;
		}}






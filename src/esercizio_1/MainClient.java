package esercizio_1;

import java.util.Scanner;

public class MainClient {

	public static void main(String[] args) {
		FabbricaAstratta factory = new FabbricaFiguraGeometrica();
		
		Scanner in = new Scanner(System.in);
		
		
		boolean ripeti = true;
		
		while (ripeti) {
			
			ripeti = false;
			
			System.out.print("Seleziona un tipo di disegno tra [Rettangolo/1], [Quadrato/2], [Cerchio/3]: ");
			

				String str = in.next();
				
				if (str.equals("1"))
					str = "rettangolo";
				else if (str.equals("2"))
					str = "quadrato";		
				else if (str.equals("3"))
					str = "cerchio";
				
				
				System.out.println("\nEcco un bellissimo " + str + " anni 60! \n");
				
				FiguraGeometrica disegnoAstratto = factory.getDisegno(str);
				disegnoAstratto.disegna();

				System.out.print("Vuoi fare un altro disegno? S/N ");
				Scanner in2 = new Scanner (System.in);
				String str2 = in2.next();
				
				if (str2.equalsIgnoreCase("S"))
					ripeti=true;
				
			}
		
		System.out.println("\nProgramma terminato.");

	}

}

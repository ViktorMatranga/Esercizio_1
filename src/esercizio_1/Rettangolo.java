package esercizio_1;

public class Rettangolo implements FiguraGeometrica{

	public Rettangolo() {};
	
	@Override
	public void disegna() {
		for (int i=0; i<5; i++) {
			for (int j=0; j<25; j++){
				System.out.print("*");
			}
			
			System.out.println("");
		}
		
	}

}

package esercizio_1;

public class Quadrato implements FiguraGeometrica{	
	
	public Quadrato() {};
	
	@Override
	public void disegna() {
	for (int i=0; i<5; i++) {
		for (int j=0; j<5; j++){
			System.out.print("* ");
		}
		
		System.out.println("");
	}
	
}

}
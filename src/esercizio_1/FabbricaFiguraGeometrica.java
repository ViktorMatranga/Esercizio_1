package esercizio_1;

public class FabbricaFiguraGeometrica extends FabbricaAstratta{

	@Override
	FiguraGeometrica getDisegno(String tipologia) {
		
		if (tipologia == null)
			System.out.println("Non hai selezionato alcuna figura!");
		
		if (tipologia.equalsIgnoreCase("rettangolo"))
			return new Rettangolo();
		
		if (tipologia.equalsIgnoreCase("Quadrato"))
			return new Quadrato();
		
		if (tipologia.equalsIgnoreCase("Cerchio"))
			return new Cerchio();


		return null;
	}

}

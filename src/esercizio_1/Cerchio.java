package esercizio_1;

public class Cerchio implements FiguraGeometrica{	
	
	public Cerchio() {};
	
	@Override
	public void disegna() {
		
		System.out.println("		   ******");
		System.out.println("		 **********");
		System.out.println("		************");
		System.out.println("		************");
		System.out.println("		 **********");
		System.out.println("		   ******");
	}
	
}




/*
		   ******		//2 tab + 3spazi
		 **********  //2tab + 1 spazio
		************ //2tab
		************ //2tab
		 **********  //2tab + 1 spazio
		   ******		//2 tab + 3spazi*/

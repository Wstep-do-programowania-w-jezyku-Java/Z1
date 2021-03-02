package src;

public class P1Class {

	public static void main(String[] args) {
		System.out.println("Test eclipse");
		
		int i=10;
		
		System.out.println(i);
		
		for(int j=0;j<10;j++)
			System.out.println(j);
		
		liczbaJakoTekst(10);
	}
	
	private static String liczbaJakoTekst(int i) {
		String result="null";
		
		switch(i) {
		case 1:
			System.out.println("Otrzymano 1");
			break;
		case 2:
			System.out.println("Otrzymano 2");
			break;
		default:
			System.out.println("Nie znam takiej liczby");
			break;
		}
		
		return result;
	}

}

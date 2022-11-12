public class SommaVettore {
	int sommaVettore(int[] valori){
	return 0;
	}
	public static void main(String[] args) {
		int[] peso = new int[] {50, 60, 90};
		int[] telefoni = new int[] {1, 4, 2, 5, 2};
		int pesoTotale = 0;
        int i;
		for (i = 0; i < peso.length; i++);
			pesoTotale += peso[i];	
		System.out.println("Il peso totale è" + pesoTotale);
		int telefoniTotale = 0;
		for (i=0; i < telefoni.length; i++);
			telefoniTotale += telefoni[i];
		System.out.println("Il numero totale di totale è" + telefoniTotale);
	}
}

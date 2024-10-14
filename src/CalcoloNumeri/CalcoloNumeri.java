package CalcoloNumeri;

public class CalcoloNumeri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Devi fornire almeno tre numeri interi come argomenti.");
	
		int numero1 = Integer.parseInt(args[0]);
		int numero2 = Integer.parseInt(args[1]);
		int numero3 = Integer.parseInt(args[2]);
		
		int somma;
		int sottrazione;
		
		System.out.println(Integer.parseInt(args[0]));
		System.out.println(Integer.parseInt(args[1]));
		System.out.println(Integer.parseInt(args[2]));
		
	
		if(numero1 == 1) {
			somma = numero2 + numero3;
			System.out.println("La somma è: " + somma);
		}
		else if(numero1 == 2){
			sottrazione = numero2 - numero3;
			System.out.println("La sottrazione è: " + sottrazione);
		}
		else {
			System.out.println("Il numero intero inserito non è nè 1 nè 2");
		}
		

		}
	

}

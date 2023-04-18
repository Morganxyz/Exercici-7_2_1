import java.util.Scanner;

public class M72Ex_1_Damat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 0;
		char car1 = '*';
		
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introdeix un nombre per formar una figura mig arbre: ");
		num1 = entrada.nextInt();
		
		for (int i = 0; i < num1 ; i++) {
			    System.out.println(" ");
			for(int j = 0; j < (i+1) ; j++) {
				System.out.print(car1);
				
			}
		
		}
		
	}

}

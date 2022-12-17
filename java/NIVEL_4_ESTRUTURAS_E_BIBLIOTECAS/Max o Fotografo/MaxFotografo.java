import java.util.*;

class MaxFotografo {
	public static void fotografia(int[] fileira, int cm) {
		boolean enfileirou = false;
		
		int metade = fileira.length / 2;
		int[] fileiraCima = new int[metade];
		int[] fileiraBaixo = new int[metade];
		
		for(int i = 0; i < metade; i++) {
			fileiraBaixo[i] = fileira[i];
			fileiraCima[i] = fileira[fileira.length - metade + i];

			if((fileiraCima[i] - fileiraBaixo[i]) >= cm) { enfileirou = true; }
			else {  
				enfileirou = false; 
				i = metade;	
			 }  
		}

		if(enfileirou) { System.out.println("SIM"); }
		else { System.out.println("NAO"); }
	}
	
	public static void sort(int[] array) {
		for(int i = 0; i < array.length - 1; i++) {
			for(int j = i + 1; j < array.length; j++) {
				if(array[i] > array[j]) {
					int tmp = array[i];
					array[i] = array[j];
					array[j] = tmp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int quantFileiras = sc.nextInt(), pessoas = 0, cm = 0;
		
		for(int i = 0; i < quantFileiras; i++) {
			pessoas = sc.nextInt();	
			cm = sc.nextInt();
			int[] fileira = new int [pessoas * 2];
			
			for(int j = 0; j < fileira.length; j++) { fileira[j] = sc.nextInt(); }
			
			sort(fileira);
			fotografia(fileira, cm);	
		}
		
		sc.close();	
	}
}

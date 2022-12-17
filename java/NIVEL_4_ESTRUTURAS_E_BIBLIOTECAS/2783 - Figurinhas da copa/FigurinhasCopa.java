import java.util.*;

class FigurinhasCopa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int qta = sc.nextInt(), dif = 0, rep = 0;
		int[] figurinhas = new int[qta];	

		for(int i = 0; i < qta; i++) {
			figurinhas[i] = sc.nextInt();			
		}

		for(int i = 0; i < figurinhas.length - 1; i++) {
			for(int j = i + 1; j < figurinhas.length; j++) {
				if(figurinhas[i] > figurinhas[j]) {
					int tmp = figurinhas[i];
					figurinhas[i] = figurinhas[j];
					figurinhas[j] = tmp;
				}
			}
		}

		for(int i = 0; i < figurinhas.length; i++)  {
			if(i+1 < figurinhas.length && figurinhas[i] == figurinhas[i + 1]) {
				rep++;
				
				if(i > 0 && figurinhas[i] == figurinhas[i - 1]) {
					rep--;
				}
			} else { dif++; }
		}
		
		System.out.println(dif);
		System.out.println(rep); 

		sc.close();		
	}
}

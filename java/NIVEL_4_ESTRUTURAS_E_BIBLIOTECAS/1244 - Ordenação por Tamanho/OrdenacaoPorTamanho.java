import java.util.*;

class OrdenacaoPorTamnho {

	public static void sort(String[] array) {
		for(int i = 0; i < array.length - 1; i++) {
			for(int j = i + 1; j < array.length; j++) {
				if(array[i].length() < array[j].length()) { 
					String tmp = array[i];
					array[i] = array[j];
					array[j] = tmp;
				}
			}
		}
	}

	public static void show(String[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	public static int sizeArray(String[] array) {
		int counter = 0;
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] != null) { counter++; }
			else { i = array.length; }
		}

		return counter;
	}

	public static String[] mySplit(String line) {
		String[] array = new String[50];
		String auxiliaryText = "";
		int counter = 0;

		for(int i = 0; i < line.length(); i++) {
			if(i != line.length() - 1) {
				if(line.charAt(i) != ' ') {
					auxiliaryText += line.charAt(i);
				} else {
					array[counter++] = auxiliaryText;
					auxiliaryText = "";
				}
			} else {
				array[counter++] = auxiliaryText;
				auxiliaryText = "";
			}
		}

		int n = sizeArray(array);
		String[] rightSizeArray = new String[n]; 

		for(int i = 0; i < n; i++) {
			rightSizeArray[i] = array[i];
		}
		return rightSizeArray;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = Integer.parseInt(sc.nextLine());
		String[] texts;
		String line;
		
		for(int i = 0; i < testCases; i++) {
			line = sc.nextLine();
			texts = mySplit(line);
			
			sort(texts);
			show(texts);
		}

		sc.close();
	}
}

import java.util.*;

class QueTantoDeFilme2 {
    public static void initialize(int[] arrays) {
        for(int i = 0; i < arrays.length; i++) {
            arrays[i] = 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfYears = Integer.parseInt(sc.nextLine()), counterWinners = 0, counterThrobbing = 0;
        String entry, exchangeWord = "";
        String[] oscarMovieTips = new String[4], oscarWinningMovies = new String[4];
        int[] listOfCategories = new int[4]; 

        initialize(listOfCategories);

        for(int i = 0; i < numberOfYears; i++) {
            for(int j = 0; j < 10; j++) {
                entry = sc.nextLine();

                if(entry.equals("Palpites") || entry.equals("Vencedores")) {
                    exchangeWord = entry;
                } else {
                    if(exchangeWord.equals("Palpites")) {
                        oscarMovieTips[counterThrobbing++] = entry;
                    } else {
                        oscarWinningMovies[counterWinners++] = entry;
                    }
                }
            }

            for(int j = 0; j < listOfCategories.length; j++) {
                if(oscarMovieTips[j].equals(oscarWinningMovies[j])) {
                    listOfCategories[j] += 1;
                }
            }

            

            counterThrobbing = 0;
            counterWinners = 0;
        }

        for(int j = 0; j < listOfCategories.length; j++) {
            if(listOfCategories[j] == 0) {
                System.out.print((j + 1) + " ");
            }
        }

        sc.close();
    }
}
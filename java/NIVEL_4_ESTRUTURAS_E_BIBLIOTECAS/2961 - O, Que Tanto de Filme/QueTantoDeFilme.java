import java.util.*;

class QueTantoDeFilme {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] guessMovies, winningFilms;
        int[] result = new int[4];
        int years = Integer.parseInt(sc.nextLine()), counter = 0;

        while(counter < years) {
            guessMovies = new String[4];
            winningFilms = new String[4];

            sc.nextLine();
            for(int i = 0; i < guessMovies.length; i++) {
                guessMovies[i] = sc.nextLine();
            }

            sc.nextLine();
            for(int i = 0; i < winningFilms.length; i++) {
                winningFilms[i] = sc.nextLine();
            }

            for(int i = 0; i < result.length; i++) {
                if(guessMovies[i].equals(winningFilms[i])) {
                    result[i] += 1;
                }
            }
            System.out.println(Arrays.toString(result));
            counter++;
        } 
        
        for(int i = 0; i < result.length; i++) {
            if(result[i] == 0) {
                System.out.print((i + 1) + " ");
            }
        }

        sc.close();
    }
}
import java.util.*;

class Times {
    public static void show(String[] gameTeam) {
        for(int i = 0; i < gameTeam.length; i++) {
            System.out.println(gameTeam[i]);
        }
        System.out.println();
    }

    public static int arraySize(String[] array) {
        int counter = 0;

        for(int i = 0; i < array.length; i++) {
            if(array[i] != null) { counter++; } 
            else { i = array.length; }
        }

        return counter;
    }

    public static void sort(String[] gameTeam) {
        int n = arraySize(gameTeam);
        for(int i = 0 ; i < n - 1; i++) {
            for(int j = i + 1; j < n; j++) {
                if((gameTeam[i].compareTo(gameTeam[j])) > 0) {
                    String tmp = gameTeam[i];
                    gameTeam[i] = gameTeam[j];
                    gameTeam[j] = tmp;
                }
            }
        }
    }
    
    public static void showTimes(String[] players, int times) {
        int playerByTeams = players.length / times;
        String[] gameTeam = new String[playerByTeams + 1];
        int counter = 0;

        for(int i = 0; i < times; i++) {
            System.out.println("Time " + (i+1));

            for(int j = i; j < players.length; j += times) {
                gameTeam[counter++] = players[j];
            }

            sort(gameTeam);
            show(gameTeam);

            counter = 0;
        }
    }

    public static void sortDouble(String[] players, int[] playersLevel) {
        for(int i = 0; i < playersLevel.length - 1; i++) {
            for(int j = i + 1; j < playersLevel.length; j++) {
                if(playersLevel[i] < playersLevel[j]) {
                    int tmpLevel = playersLevel[i];
                    String tmpPlayer = players[i];

                    playersLevel[i] = playersLevel[j];
                    players[i] = players[j];

                    playersLevel[j] = tmpLevel;
                    players[j] = tmpPlayer;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalPlayers = sc.nextInt(), times = sc.nextInt();
        String[] players = new String[totalPlayers];
        int[] playersLevel = new int[totalPlayers];

        for(int i = 0; i < totalPlayers; i++) {
            players[i] = sc.next();
            playersLevel[i] = sc.nextInt();
        }

        sortDouble(players, playersLevel);
        showTimes(players, times);

        sc.close();
    }
}
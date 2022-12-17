import java.util.*;

class Times {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Totalplayers = sc.nextInt(), times = sc.nextInt(), level;
        String[] players = new String[Totalplayers];

        for(int i = 0; i < Totalplayers; i++) {
            players[i] = sc.next();
            level = sc.nextInt();
        }

        sc.close();
    }
}
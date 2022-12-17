import java.util.*;

class HallAssassinos {
    public static String[] arraySize(String[] array) {
        int counter = 0;
        String[] optimalSizeArray;

        for(int i = 0; i < array.length; i++) {
            if(array[i] != null) { counter++; } 
            else { i = array.length; }
        }
        
        optimalSizeArray = new String[counter];
        
        for(int i = 0; i < counter; i++) {
            optimalSizeArray[i] = array[i];
        }

        return optimalSizeArray;
    }

    public static void showKiller(String[] killer, String[] murdererd) {
        int counter = 0;
        boolean deadAssassin = false;

        for(int i = 0; i < killer.length; i++) {
            for(int j = 0; j < killer.length; j++) {
                if(killer[i].equals(killer[j])) {
                    counter++;
                }

                if(killer[i].equals(murdererd[j])) {
                    deadAssassin = true;
                    j = killer.length;
                }
            }

            if(deadAssassin != true) {
                if(i <= 0) { System.out.println(killer[i] + " " + counter); }
                else if(i > 0 && (killer[i].equals(killer[i - 1]) != true)) {
                    System.out.println(killer[i] + " " + counter);
                }
            }

            deadAssassin = false;
            counter = 0;
        }
    }

    public static void sort(String[] killer, String[] murdererd) {  
        for(int i = 0; i < killer.length - 1; i++) {
            for(int j = i + 1; j < killer.length; j++) {
                if((killer[i].compareTo(killer[j])) > 0) {
                    String tmpKiller = killer[i];
                    String tmpMurdererd = murdererd[i];

                    killer[i] = killer[j];
                    murdererd[i] = murdererd[j];

                    killer[j] = tmpKiller;
                    murdererd[j] = tmpMurdererd;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] killer = new String[100];
        String[] murdererd = new String[100];
        int counterKiller = 0, counterMurdererd = 0;

        while(sc.hasNext()) {
            killer[counterKiller++] = sc.next();
            murdererd[counterMurdererd++] = sc.next();
        }

        killer = arraySize(killer);
        murdererd = arraySize(murdererd);

        sort(killer, murdererd);
        System.out.println("HALL OF MURDERERS");
        showKiller(killer, murdererd);

        sc.close();
    }
}
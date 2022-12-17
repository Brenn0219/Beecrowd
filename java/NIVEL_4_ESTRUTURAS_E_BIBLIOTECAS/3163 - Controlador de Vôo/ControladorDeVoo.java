import java.util.*;

class ControladorDeVoo {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String entry, cardinalPoint = "";
        String[] westPlanes = new String[10], northPlanes = new String[10], southPlanes = new String[10], eastPlanes = new String[10], airplane;
        int westPlaneCounter = 0, northPlaneCounter = 0, southPlaneCounter = 0, eastPlaneCounter = 0, totalOfPlanes = 0, directionWithMorePlanes = 0, position = 0; 
        
        do {
            entry = sc.nextLine();

            if(entry.equals("0") != true) {
                if(entry.equals("-4") || entry.equals("-3") || entry.equals("-2") || entry.equals("-1")) {
                    cardinalPoint = entry;
                    entry = sc.nextLine();
                }

                if(cardinalPoint.equals("-1")) {
                    westPlanes[westPlaneCounter++] = entry;
                    directionWithMorePlanes = ((westPlaneCounter > directionWithMorePlanes) ? westPlaneCounter : directionWithMorePlanes);
                } else if(cardinalPoint.equals("-3")) {
                    northPlanes[northPlaneCounter++] = entry;
                    directionWithMorePlanes = ((northPlaneCounter > directionWithMorePlanes) ? northPlaneCounter : directionWithMorePlanes);
                } else if(cardinalPoint.equals("-2")) {
                    southPlanes[southPlaneCounter++] = entry;
                    directionWithMorePlanes = ((southPlaneCounter > directionWithMorePlanes) ? southPlaneCounter : directionWithMorePlanes);
                } else if(cardinalPoint.equals("-4")) {
                    eastPlanes[eastPlaneCounter++] = entry;
                    directionWithMorePlanes = ((eastPlaneCounter > directionWithMorePlanes) ? eastPlaneCounter : directionWithMorePlanes);
                }
            }

        } while (entry.equals("0") != true);

        totalOfPlanes = westPlaneCounter + northPlaneCounter + southPlaneCounter + eastPlaneCounter;
        airplane = new String[totalOfPlanes];
        
        for(int i = 0; i < directionWithMorePlanes; i++) {
            if(i <= westPlaneCounter && westPlanes[i] != null) {
                airplane[position++] = westPlanes[i];
            }
            if(i <= northPlaneCounter && northPlanes[i] != null) {
                airplane[position++] = northPlanes[i];
            }
            if(i < southPlaneCounter && southPlanes[i] != null) {
                airplane[position++] = southPlanes[i];
            }
            if(i < eastPlaneCounter && eastPlanes[i] != null) {
                airplane[position++] = eastPlanes[i];
            }
        }

        for(int i = 0; i < airplane.length; i++) { System.out.print(airplane[i] + " "); }
        System.out.println();

        sc.close();
    }
}
import java.util.*;

class PresenteDeNatal {
    public static void swap(String[] giftName, double[]giftPrice, int[] preferenceScale, int i, int j) {
        
    } 

    public static void sort(String[] giftName, double[]giftPrice, int[] preferenceScale) {
        for(int i = 0; i < preferenceScale.length - 1; i++) {
            for(int j = i + 1; j < preferenceScale.length; j++) {
                if(preferenceScale[i] > preferenceScale[j]) {
                    swap(giftName, giftPrice, preferenceScale, i, j);
                }
            }
        }
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] giftName;
        int[] preferenceScale;
        double[] giftPrice;
        String name;
        int numberOfGiftsListed;

        name = sc.next();
        numberOfGiftsListed = Integer.parseInt(sc.next());

        giftName = new String[numberOfGiftsListed];
        giftPrice = new double[numberOfGiftsListed];
        preferenceScale = new int[numberOfGiftsListed];

        sc.nextLine();
        for(int i = 0; i < numberOfGiftsListed; i++) {
            giftName[i] = sc.nextLine();
            giftPrice[i] = Double.parseDouble(sc.next());
            preferenceScale[i] = Integer.parseInt(sc.next());
            sc.nextLine();

            sort(giftName, giftPrice, preferenceScale);
            show(giftName, giftPrice);
        }

        sc.close();
    }
}
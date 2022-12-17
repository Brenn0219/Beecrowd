import java.util.*;

class ListaDeCompras {
    public static void show(String[] array) {
        for(int  i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
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

    public static String[] organizeShoppingList(String[] listTotal) {
        String[] list = new String[listTotal.length], organizedItems;
        int counter = 0, n;

        list[counter++] = listTotal[0];
        for(int i = 1; i < listTotal.length; i++) {
            if((listTotal[i - 1].equals(listTotal[i])) != true) {
                list[counter++] = listTotal[i];
            }
        }

        n = arraySize(list); 
        organizedItems = new String[n];

        for(int i = 0; i < n; i++) {
            organizedItems[i] = list[i];
        }

        return organizedItems;
    }

    public static void sort(String[] listTotal) {
        for(int i = 0; i < listTotal.length - 1; i++) {
            for(int j = i + 1; j < listTotal.length; j++) {
                if((listTotal[i].compareTo(listTotal[j])) > 0 ) {
                    String tmp = listTotal[i];
                    listTotal[i] = listTotal[j];
                    listTotal[j] = tmp;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String[] shoppingList = new String[100];
        String lineOfItems;
        int listTotal = Integer.parseInt(sc.nextLine());

        for(int i = 0; i < listTotal; i++) {
            lineOfItems = sc.nextLine();
            shoppingList = lineOfItems.split(" ");
            
            sort(shoppingList);
            shoppingList = organizeShoppingList(shoppingList);
            show(shoppingList);
        }

        sc.close();   
    }
}
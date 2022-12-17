import java.util.*;

class Camisetas {
    public static void show(String[] logoColor, String[] tshirtSize, String[] studentsName) {
        for(int i = 0; i < logoColor.length; i++) {
            System.out.print(logoColor[i]);
            System.out.print(tshirtSize[i] + " ");
            System.out.println(studentsName[i]);
        }
        System.out.println();
    }

    public static void swap(String[] logoColor, String[] tshirtSize, String[] studentsName, int i, int j) {
        String logo = logoColor[i];
        String shirt = tshirtSize[i];
        String students = studentsName[i];

        logoColor[i] = logoColor[j];
        tshirtSize[i] = tshirtSize[j];
        studentsName[i] = studentsName[j];

        logoColor[j] = logo;
        tshirtSize[j] = shirt;
        studentsName[j] = students;
    }

    public static void sort(String[] logoColor, String[] tshirtSize, String[] studentsName) {
        for(int i = 0; i < logoColor.length - 1; i++) {
            for(int j = i + 1; j < logoColor.length; j++) {
                if((logoColor[i].compareTo(logoColor[j])) > 0) {
                    swap(logoColor, tshirtSize, studentsName, i, j);
                } else if (logoColor[i].equals(logoColor[j])) {
                    if((tshirtSize[i].compareTo(tshirtSize[j])) < 0) {
                        swap(logoColor, tshirtSize, studentsName, j, i);
                    } else if (tshirtSize[i].equals(tshirtSize[j])) {
                        if((studentsName[i].compareTo(studentsName[j])) > 0) {
                            swap(logoColor, tshirtSize, studentsName, i, j);
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfTshirts;
        String[] studentsName;
        String[] tshirtSize;
        String[] logoColor;

        do {
            numberOfTshirts = Integer.parseInt(sc.nextLine()); 
            
            if(numberOfTshirts != 0) {
                studentsName = new String[numberOfTshirts];
                tshirtSize = new String[numberOfTshirts];
                logoColor = new String[numberOfTshirts];

                for(int i = 0 ; i < numberOfTshirts; i++) {
                    studentsName[i] = sc.nextLine();
                    logoColor[i] = sc.next();
                    tshirtSize[i] = sc.nextLine();
                }
        
                sort(logoColor, tshirtSize, studentsName);
                show(logoColor, tshirtSize, studentsName); 
            }

        } while (numberOfTshirts != 0);

        sc.close();
    }
}
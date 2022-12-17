import java.util.*;

class AmigosDoHabay {
    public static void escolherAmigo(String[] nomesOrdenados, String[] nomes) {
        int tamanho = nomesOrdenados[0].length();
        String nomeMaio = nomesOrdenados[0];

        for(int i = 1; i < nomesOrdenados.length; i++) {
            if(tamanho < nomesOrdenados[i].length()) {
                tamanho = nomesOrdenados[i].length();
                nomeMaio = nomesOrdenados[i];
            } else if (tamanho == nomesOrdenados[i].length()) {
                for(int j = 0; j < nomes.length; j++) {
                    if(nomes[j].equals(nomesOrdenados[i]) || nomes[j].equals(nomeMaio)) {
                        nomeMaio = nomes[j];
                        tamanho = nomes[j].length();
                        j = nomes.length;
                    }
                }
            }
        }

        System.out.println("Amigo do Habay: ");
        System.out.println(nomeMaio);
    }

    public static void mostrar(String[] arry) {
        for(int i = 0; i < arry.length; i++) {
            System.out.println(arry[i]);
        }
    }

    public static int tamanhoDaArray(String[] arry) {
        int contador = 0;
        for(int i = 0; i < arry.length; i++) {
            if(arry[i] != null) { contador++; }
            else { i = arry.length; }
        }
        return contador;
    }

    public static String[] organizarArray(String[] arry) {
        int tamanhoNovo = tamanhoDaArray(arry), contador = 0, pos = 0;
        String[] novoArray = new String[tamanhoNovo];

        for(int i = 0; i < tamanhoNovo; i++) {
            Boolean encontrou = false;

            for(int j = 0; j < novoArray.length; j++) {
                if(arry[i].equals(novoArray[j])) {
                    encontrou = true;
                    j = novoArray.length; 
                }
            }

            if(encontrou != true) {
                novoArray[contador++] = arry[i];
            } 
        }
        
        String[] arrayOrdenado = new String[contador];

        for(int i = 0; i < contador; i++) {
            arrayOrdenado[pos++] = novoArray[i];
        }

        return arrayOrdenado;
    }

    public static void sort(String[] arry, int n) {
        for(int i = 0; i < n - 1; i++) {
            for(int j = i + 1; j < n; j++) {
                if((arry[i].compareTo(arry[j]) > 0)) {
                    String tmp = arry[i];
                    arry[i] = arry[j];
                    arry[j] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[50];
        String[] nomesAmigos = new String[50];
        String[] nomesNo = new String[50];
        String nome, amigoDoHabay;
        int qtsNomes = 0, noNome = 0;

        do {
            nome = sc.next();

            if((nome.compareTo("FIM") != 0)) {
                amigoDoHabay = sc.next();

                if((amigoDoHabay.compareTo("YES")) == 0) {
                    nomes[qtsNomes++] = nome;
                } else {
                    nomesNo[noNome++] = nome;
                }
            }

        } while((nome.compareTo("FIM") != 0));

        for(int i = 0; i < nomesAmigos.length; i ++) {
            nomesAmigos[i] = nomes[i];
        }

        sort(nomes, qtsNomes);
        sort(nomesNo, noNome);

        String[] nomesOrdenados = new String[qtsNomes];
        nomesOrdenados = organizarArray(nomes);

        String[] nomesNoAmigos = new String[qtsNomes];
        nomesNoAmigos = organizarArray(nomesNo);

        mostrar(nomesOrdenados);
        mostrar(nomesNoAmigos);

        System.out.println();
        escolherAmigo(nomesOrdenados, nomesAmigos);   

        sc.close();
    }
}
import java.util.*;

class FilaRecreio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testes = sc.nextInt(), movimentacoes = 0;

        for(int i = 0; i < testes; i++) {
            int alunos = sc.nextInt();
            int[] fila = new int[alunos];
            int[] ordenado = new int[alunos];
            
            for(int j = 0; j < alunos; j++) {
                fila[j] = sc.nextInt();
                ordenado[j] = fila[j];
            }
           
            for(int j = 0; j < ordenado.length - 1; j++) {
                for(int k = j + 1; k < ordenado.length; k++) {
                    if(ordenado[j] < ordenado[k]) {
                        int tmp = ordenado[j];
                        ordenado[j] = ordenado[k];
                        ordenado[k] = tmp; 
                    }
                }
            }

            for(int j = 0; j < alunos; j++) {
                if(fila[j] == ordenado[j]) { 
                    movimentacoes++;
                }
            }

            System.out.println(movimentacoes);
            movimentacoes = 0;
        }
        
        sc.close();
    }
}
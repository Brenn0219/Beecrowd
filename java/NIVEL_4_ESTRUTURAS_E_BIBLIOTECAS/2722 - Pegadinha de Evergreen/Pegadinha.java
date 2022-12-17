import java.util.Scanner;

class Pegadinha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalNomes = sc.nextInt(), n = 0, s = 0;
        String nome, sobrenome, nomeCompleto = "";
        boolean nomeLeitura = false, sobrenomeLeitura = false;
        
        sc.nextLine();
        for(int i = 0; i < totalNomes; i++) {
            nome = sc.nextLine();
            sobrenome = sc.nextLine();
            
            while(nomeLeitura != true && sobrenomeLeitura != true) {
                if(n <= nome.length()-1) {
                    nomeCompleto += nome.charAt(n++);
                    if(n <= nome.length()-1) { nomeCompleto += nome.charAt(n++); }
                } else {
                    nomeLeitura = true;
                }
    
                if(s <= sobrenome.length()-1) {
                    nomeCompleto += sobrenome.charAt(s++);
                    if(s <= sobrenome.length()-1) {nomeCompleto += sobrenome.charAt(s++);}
                } else {
                    sobrenomeLeitura = true;
                }
            }

            System.out.println(nomeCompleto);
            nomeCompleto = "";
            s = n = 0;
            nomeLeitura = sobrenomeLeitura = false;
        }

        sc.close();
    }
}
public class exercicio4 {
    public static void main(String[] args) {
        //declaracao
        int numero[] = {0,0,0,0,0,0,0,0,0,0};

        //leitura
        for (int i = 0; i < numero.length; i++) {
            numero[i] = MyIO.readInt();
        }

        //selecao do maior
        int maior = numero[0];
        for (int i = 1; i < numero.length; i++){
            if(maior < numero[i])maior = numero[i];
        }

        //impressao na tela
        MyIO.println("Maior numero: " + maior);
    }
    
}

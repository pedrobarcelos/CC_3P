public class exercicio22 {
    public static void main(String[] args) {
        //declaracao
        int vetor[] = {10,5,8,2,8};
    
        //impressao
        for (int i = 0; i <vetor.length; i++) {
            if(i < vetor.length -1)MyIO.print(vetor[i] + ", ");
            else MyIO.print(vetor[i]);
        }
    }
}

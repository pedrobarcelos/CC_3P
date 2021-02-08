public class exercicio14 {
    public static void main(String[] args) {
        //declaracao
        int sequence[] = {1,5,12,16,23,27,34};
        int TAMseq = sequence.length;
        int N;

        //leitura
        N = MyIO.readInt();

        //testes e impressao
        if(N > TAMseq)MyIO.println("Numero inválido. O limite é 7");
        else{
            for(int i = 0; i < N; i++){
                MyIO.println(sequence[i]);
            }
        }
    }
}

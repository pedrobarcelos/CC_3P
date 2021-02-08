public class exercicio13 {
    public static void main(String[] args) {
        //declaracao
        int i = 0;
        int odd = 0;
        int N;

        //leitura
        N = MyIO.readInt();

        //loop + imnpressao
        while(N > odd) {
            if(i%2!=0){
                MyIO.println(i);
                odd ++;
            }
            i++;
        }
    }
}

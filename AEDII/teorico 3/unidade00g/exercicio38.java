public class exercicio38 {
    public static void main(String[] args) {
        int L = MyIO.readInt("Insira L: ");
        int C = MyIO.readInt("Insira C: ");
        int[] media = new int[C];
        int[][] matriz = new int[L][C];
        int coluna = 0;
        
        // leitura
        for (int j = 0; j < C; j++) {
            for (int i = 0; i < L; i++) {
                matriz[i][j] = MyIO.readInt("Matriz[" + i + "][" + j + "] = ");
                media[j]+= matriz[i][j];
                if(i ==  L - 1)media[j] /= L;
            }
        }

        //impressao
        for(int i = 0; i < C; i++) {
            MyIO.println("Media da Coluna "+i+ ": " + media[i]);
        }
        
    }
}

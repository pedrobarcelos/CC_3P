public class exercicio36 {
    public static void main(String[] args) {
        int L = MyIO.readInt("Insira L: ");
        int C = MyIO.readInt("Insira C: ");
        int media = 0;
        int[][] matriz = new int[L][C];

        // leitura
        for (int i = 0; i < L; i++) {
            for (int j = 0; j < C; j++) {
                matriz[i][j] = MyIO.readInt("Matriz[" + i + "][" + j + "] = ");
                media += matriz[i][j];
            }
            if(i == L -1)media /= (L*C);
        }

        //impressao
        MyIO.println("Media dos elementos: " + media);
    }
}

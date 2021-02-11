public class exercicio32 {
    public static void main(String[] args) {
        int L = MyIO.readInt("Insira L: ");
        int C = MyIO.readInt("Insira C: ");
        int[][] matriz = new int[L][C];

        // leitura
        for (int i = 0; i < L; i++) {
            for (int j = 0; j < C; j++) {
                matriz[i][j] = MyIO.readInt("Matriz[" + i + "][" + j + "] = ");
            }
        }

        // formato grid
        for (int i = 0; i < L; i++) {
            for (int j = 0; j < C; j++) {
                if (j < C - 1) {
                    if (matriz[i][j] / 10 > 1) {
                        MyIO.print(matriz[i][j] + "  ");
                    } else
                        MyIO.print(matriz[i][j] + " ");
                } else
                    MyIO.print(matriz[i][j] + "\n");
            }
        }
    }
}

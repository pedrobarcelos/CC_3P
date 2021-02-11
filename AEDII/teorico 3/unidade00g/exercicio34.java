public class exercicio34 {
    public static void main(String[] args) {
        int L = MyIO.readInt("Insira L: ");
        int C = MyIO.readInt("Insira C: ");
        int[][] matriz1 = new int[L][C];
        int[][] matriz2 = new int[L][C];

        // leitura
        for (int i = 0; i < L; i++) {
            for (int j = 0; j < C; j++) {
                matriz1[i][j] = MyIO.readInt("Matriz1[" + i + "][" + j + "] = ");
            }
        }
        
        // leitura
        for (int i = 0; i < L; i++) {
            for (int j = 0; j < C; j++) {
                matriz2[i][j] = (MyIO.readInt("Matriz2[" + i + "][" + j + "] = ") + matriz1[i][j]);
            }
        }


        // formato grid
        MyIO.println("Matriz resultante: ");
        for (int i = 0; i < L; i++) {
            for (int j = 0; j < C; j++) {
                if (j < C - 1) {
                    if (matriz2[i][j] / 10 > 1) {
                        MyIO.print(matriz2[i][j] + "  ");
                    } else
                        MyIO.print(matriz2[i][j] + " ");
                } else
                    MyIO.print(matriz2[i][j] + "\n");
            }
        }
    }
}

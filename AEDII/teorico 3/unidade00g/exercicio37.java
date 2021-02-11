public class exercicio37 {
    public static void main(String[] args) {
            int L = MyIO.readInt("Insira L: ");
            int C = MyIO.readInt("Insira C: ");
            int[] media = new int[L];
            int[][] matriz = new int[L][C];
    
            // leitura
            for (int i = 0; i < L; i++) {
                for (int j = 0; j < C; j++) {
                    matriz[i][j] = MyIO.readInt("Matriz[" + i + "][" + j + "] = ");
                    media[i]+= matriz[i][j];
                    if(j == C -1)media[i]/=C;
                }
                
            }
    
            //impressao
            for(int i = 0; i < L; i++) {
                MyIO.println("Media da linha "+i+ ": " + media[i]);
            }
    }
}

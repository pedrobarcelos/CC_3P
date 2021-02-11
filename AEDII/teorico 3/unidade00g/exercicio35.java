public class exercicio35 {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        MyIO.println("Essa eh uma matriz 4x4, preencha-a: ");

        //leitura
        for (int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                matriz[i][j] = MyIO.readInt("Matriz[" + i + "][" + j + "] = ");
            }
        }

        //diagonal principal
        MyIO.println("Diagonal Principal:");
        for (int i = 0; i < 4; i++){
            if(i == 0)MyIO.println(matriz[i][i]);
            else if(i == 1)MyIO.println(" " + matriz[i][i]);
            else if(i == 2)MyIO.println("  " + matriz[i][i]);
            else MyIO.println("   " + matriz[i][i]);
        }

        MyIO.println("Diagonal Secundaria:");
        int j = 3;
        for (int i = 0; i < 4; i++){
            if(i == 0)MyIO.println("    " + matriz[i][j]);
            else if(i == 1)MyIO.println("   " + matriz[i][j]);
            else if(i == 2)MyIO.println("  " + matriz[i][j]);
            else MyIO.println(" " + matriz[i][j]);
            j--;
        }
    }
}

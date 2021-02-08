public class exercicio19 {
    public static void main(String[] args) {
        //declaracao
        int n = MyIO.readInt("N = ");
        int[] array = new int[n];
        int menor =0; int pos = 0;

        //leitura
        for (int i = 0; i < n; i++){
            array[i] = MyIO.readInt("Vetor["+i+"] = ");
            if(i ==0)menor = array[i];
            else if(menor > array[i]) {
                menor = array[i];
                pos = i;
            }
        }

        //impressao
        MyIO.println("Menor elemento: Vetor[" + pos + "] = " + menor);
    }
}

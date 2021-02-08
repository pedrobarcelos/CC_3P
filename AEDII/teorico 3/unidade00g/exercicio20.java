public class exercicio20 {
    public static void main(String[] args) {
        // declaracao
        int n = MyIO.readInt("N = ");
        int[] array = new int[n];

        // leitura
        for (int i = 0; i < n; i++) {
            array[i] = MyIO.readInt("Vetor[" + i + "] = ");
        }
        int tmp = array[0];

        // ordenacao
        for (int i = 0; i < array.length - 1; i++) {
            int menor = i;

            for (int j = menor + 1; j < array.length; j++) {
                if (array[j] < array[menor]) {
                    menor = j;
                }
            }
            if (menor != i) {
                int t = array[i];
                array[i] = array[menor];
                array[menor] = t;
            }
        }

        // impressao
        for (int i = 0; i < n; i++) {
            MyIO.println(array[i]);
        }
    }
}

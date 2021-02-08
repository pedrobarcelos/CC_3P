public class exercicio28 {
    public static void main(String[] args) {
        int n = MyIO.readInt("Insira N:");
        int[] array = new int[n];
        int inicio = 0;
        int fim = n - 1;

        for (int i = 0; i < n; i++) {
            array[i] = MyIO.readInt();
        }

        for (int i = 0; i < n / 2; i++) {
            if (inicio != fim) {
                MyIO.println("Soma " + array[inicio] + " + " + array[fim] + " = " + (array[inicio] + array[fim]));
                inicio++;
                fim--;
            }
        }
    }
}
public class exercicio29 {
    public static void main(String[] args) {
        int n = MyIO.readInt("Insira N:");
        int[] array = new int[n];int[] array2 = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = MyIO.readInt("vetor1["+i+"] :");
        }
        for (int i = 0; i < n; i++) {
            array2[i] = MyIO.readInt("vetor2["+i+"] :");
        }

        for (int i = 0; i < n; i++) {
            MyIO.println("Vetor1["+i+"] = " + array[i]);
            MyIO.println("Vetor2["+i+"] = " + array2[i]);
        }
    }
}

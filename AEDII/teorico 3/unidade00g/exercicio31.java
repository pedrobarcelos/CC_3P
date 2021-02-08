//slide 221
public class exercicio31 {
    public static void main(String[] args) {
        // declaracoes
        int n = MyIO.readInt("Insira N: ");
        int[] arr = new int[n];
        int ord;

        // leitura
        for (int i = 0; i < n; i++) {
            arr[i] = MyIO.readInt("elemento " + i + ": ");
            ord = arr[0];
        }

        // ordenacao - selection sort -
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
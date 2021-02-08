public class exercicio27 {
    public static void main(String[] args) {
        int n = MyIO.readInt("Insira N:");
        int[] array = new int[n];
        int soma = 0;

        for(int i = 0; i < n; i++){
            array[i] = MyIO.readInt();
            if(array[i]%3==0)soma += array[i];
        }

        MyIO.println("Soma dos divisiveis por tres: " + soma);
    }
}

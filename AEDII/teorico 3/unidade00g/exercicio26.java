public class exercicio26 {
    public static void main(String[] args) {
        int n = MyIO.readInt("Insira N:");
        int[] array = new int[n];
        int posMenor = 0;

        for(int i = 0; i < n; i++){
            array[i] = MyIO.readInt();
            if(i>0 && array[i] < array[i-1])posMenor = i;
        }

        MyIO.println("Posicao do menor elemento: " + posMenor);
    }
}

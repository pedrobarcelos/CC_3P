public class exercicio24 {
    public static void main(String[] args) {
        //declaracao
        int n = MyIO.readInt("Insira N:");
        int[] array = new int[n];
        double media = 0;
        
        //calculando media e leiturar
        for(int i = 0; i < n; i++){
            array[i] = MyIO.readInt();
            media += array[i];
            if(i == n-1)media/=n;
        }

        //mostrar os maiores que a media
        MyIO.println("Maiores que a media");
        for(int i = 0; i < n; i++){
            if(array[i] > media)MyIO.println(array[i]);
        }
    }
}

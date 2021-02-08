public class exercicio17 {
    public static void main(String[] args) {
        //declaracao
        int n = MyIO.readInt("Quantos numeros inteiros? ");
        Integer[] numeros = new Integer[n];
        int i = 0;
        double media = 0.0;
        //leitura
        while(i < n){
            numeros[i] = MyIO.readInt("Numero " + (i+1) + ": ");
            media += numeros[i];
            if(numeros[i]==(n-1))media/=n;
            i++;
        }
        //calculos e impressao
        for(i = 0; i < numeros.length; i++){
            if(i == 0)MyIO.println("Maiores que a media("+media+"):");
            if(numeros[i]>media)MyIO.println(numeros[i]);
        }
    }
}

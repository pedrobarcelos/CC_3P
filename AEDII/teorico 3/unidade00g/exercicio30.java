public class exercicio30 {
    public static void main(String[] args) {
        int n = MyIO.readInt("Insira N:");
        int m = MyIO.readInt("Insira M:");
        int maior = 0;
        int menor = 0;
        if(n>m){
            maior = n;
            menor = m;
        } else {
            maior = m;
            menor = n;
        }

        int[] array = new int[menor];int[] array2 = new int[maior];

        for (int i = 0; i < menor; i++) {
            array[i] = MyIO.readInt("vetor1["+i+"] :");
        }
        for (int i = 0; i < maior; i++) {
            array2[i] = MyIO.readInt("vetor2["+i+"] :");
        }

        for (int i = 0; i < maior; i++){
            if(i < menor){
                MyIO.println("vetor1["+i+"] :" + array[i]);
                MyIO.println("vetor2["+i+"] :" + array2[i]);
            } else{
                MyIO.println("vetor2["+i+"] :" + array2[i]);
            }
        }
    }
}

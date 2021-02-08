//slide 106
public class exercicio3 {
    public static void main(String[] args) {

        //declaracoes
        int numeros[] = {0,0,0};

        //leitura percorrendo o vetor
        for (int i = 0; i < numeros.length; i++){
            numeros[i] = MyIO.readInt();
        }
        int maior = numeros[0];
        int menor = numeros[0];

        //testes
        for (int i = 1; i < numeros.length; i++){
            if(maior < numeros[i]) maior = numeros[i];
            if(menor > numeros[i]) menor = numeros[i];
        }

        //resultados
        MyIO.println("\nRESULTADOS" + 
                     "\nMaior numero: " + maior + 
                     "\nMenor numero: " + menor);

    }
}

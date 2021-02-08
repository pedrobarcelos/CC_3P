public class exercicio10 {
    public static void main(String[] args) {
        //declaracao
        int numbers[] = {0,0,0,0,0,0,0,0,0,0};
        int menor = numbers[0];
        int maior = numbers[0];

        //leitura
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = MyIO.readInt();
            if(i == 0){
                menor = numbers[i];
                maior = numbers[i];
            }
        }
        for (int i = 1; i < numbers.length; i++) {
            if(maior < numbers[i]) maior = numbers[i];
            if(menor > numbers[i]) menor = numbers[i];
        }
        
        MyIO.println("Maior: " + maior + "\nMenor: " + menor);
    }
}

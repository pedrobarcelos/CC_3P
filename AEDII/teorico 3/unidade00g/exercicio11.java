public class exercicio11 {
    public static void main(String[] args) {
        //declaracao
        int control = 0;
        int notaAlunos[] = {0,0,0,0,0};
        double average = 0;

        //loop - leitura
        while(control < 5){
            notaAlunos[control] = MyIO.readInt();
            control++;
        }

        //calculo da média
        for(int i = 0; i < 5; i++){
            average += notaAlunos[i];
            if(i == 4)average /= 5;
        }

        //resultado
        MyIO.println("Media das notas: " + average);
    }
}

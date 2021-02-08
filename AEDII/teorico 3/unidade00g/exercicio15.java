public class exercicio15 {
    public static void main(String[] args) {
        //declaracao
        double MAXgrade;
        double grades[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        double classAverage = 0;
        double average = 0.6;
        int underAverage = 0;
        int A_grades = 0;
        int i = 0;

        //leitura + calculos
        MAXgrade = MyIO.readDouble("Insira a nota maxima: ");

        while(i<20){
            //loop para minar erros
            do{
                grades[i] = MyIO.readDouble("Nota " + (i+1) + ":\n");
                if(grades[i] > MAXgrade || grades[i] < 0)MyIO.println("Nota invalida. Insira novamente.");
            }while(grades[i] > MAXgrade || grades[i] < 0);
            if(grades[i] < MAXgrade * average)underAverage++;
            if(grades[i] > MAXgrade * 0.9)A_grades++;
            classAverage += grades[i];
            if(i==19)classAverage/=20;
            i++;
        }

        //resultados
        MyIO.println("\nResultados\nMedia da turma: " + classAverage
                    + "\nAlunos abaixo da media: " + underAverage 
                    + "\nAlunos com conceito A (+90%): " + A_grades);
    }
}

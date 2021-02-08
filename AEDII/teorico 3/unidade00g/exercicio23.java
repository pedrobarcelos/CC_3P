public class exercicio23 {
    public static void main(String[] args) {
        //declaracao
        //double MAXgrade;
        double[] grades = new double[5];
        double classAverage = 0;
        double average = 0.6;
        int underAverage = 0;
        int A_grades = 0;
        int i = 0;
        double soma = grades[0];
        double menor = soma;

        //leitura + calculos
        //MAXgrade = MyIO.readDouble("Insira a nota maxima: ");

        while(i<5){
            
            //loop para minar erros
            do{
                grades[i] = MyIO.readDouble("Nota " + (i+1) + ":\n");
                if(/*grades[i] > MAXgrade ||*/ grades[i] < 0)MyIO.println("Nota invalida. Insira novamente.");
            }while(/*rades[i] > MAXgrade ||*/ grades[i] < 0);
            //if(grades[i] < MAXgrade * average)underAverage++;
            //if(grades[i] > MAXgrade * 0.9)A_grades++;
            if(i==0)menor = grades[i];
            if(i > 0 && menor > grades[i]) menor = grades[i];
            soma+=grades[i];
            classAverage += grades[i];
            if(i==4)classAverage/=5;
            i++;
        }

        //resultados
        MyIO.println("\nResultados\nMedia da turma: " + classAverage 
                    + "\nSoma das notas: " + soma + "\nMenor nota: " + menor);
                    //+ "\nAlunos abaixo da media: " + underAverage 
                    //+ "\nAlunos com conceito A (+90%): " + A_grades);
    }

}

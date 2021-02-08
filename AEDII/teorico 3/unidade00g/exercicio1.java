//slide 104
public class exercicio1{
    public static void main(String[] args) {
        //declaracao
        double nota;

        //leitura
        MyIO.println("Insira a sua nota abaixo:\n");
        nota = MyIO.readDouble();

        //testes
        if(nota>=80)MyIO.println("Parabens, muito bom\n");
        else if(nota>=70)MyIO.println("Parabens, aprovado\n");
        else MyIO.println("infelizmente, reprovado\n");
    }
}
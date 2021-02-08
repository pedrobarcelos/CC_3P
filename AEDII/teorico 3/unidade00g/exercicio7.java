public class exercicio7 {
    public static void main(String[] args) {
        //declaracao
        double salary, render;
        double tax = 0.4;

        //leitura
        MyIO.println("Entre com o seu salario: ");
        salary = MyIO.readDouble();
        MyIO.println("Insira a prestacao desejada: ");
        render = MyIO.readDouble();

        //testes e resultados
        if(render > salary*tax)MyIO.println("Emprestimo negado.");
        else MyIO.println("Emprestimo concedido com sucesso.");
    }
}

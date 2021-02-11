import java.util.Scanner;
public class exercicio39 {

    public static int thereIsChar(String str, char character) {
        int ocorrencia = 0;
        for (int i = 0; i < str.length(); i++) {
            if(character == str.charAt(i))ocorrencia++;
        }
        return ocorrencia;
    }
    public static void main(String[] args) {
        //declaracao
        Scanner scanner = new Scanner(System.in);
        MyIO.println("Insira uma String: ");
        String str = scanner.nextLine();
        char character = MyIO.readChar("insira um caractere: ");

        //chamada do metodo
        int ocorrrencia = thereIsChar(str, character);

        //impressao
        MyIO.println("O caractere '"+ character + "' aparece " + ocorrrencia + " vezes na String '" + str + "'.");
    }
}

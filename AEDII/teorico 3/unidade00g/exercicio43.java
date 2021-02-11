import java.util.Scanner;

public class exercicio43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyIO.println("Insira uma palavra: ");
        String str = scanner.nextLine();
        boolean thereIsA = false;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 65 || str.charAt(i) == 97){
                MyIO.println("A primeira ocorrencia da letra 'A' ocorreu no carectere " + i + " da palavra '" + str + "'.");
                i = str.length();
            }
            if(i == str.length()-1)MyIO.println("Nao ouveram ocorrencias da letra 'A' na palavra '" + str + "'.");
        }
    }    
}

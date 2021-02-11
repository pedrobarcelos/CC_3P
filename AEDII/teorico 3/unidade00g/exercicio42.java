import java.util.Scanner;

public class exercicio42 {
    public static int numMaiusc(String str){
        int maiusc = 0;
        for (int i = 0; i <str.length(); i++){
            if(str.charAt(i)>64 && str.charAt(i) < 91)maiusc++;
        }
        return maiusc;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyIO.println("Insira uma palavra: ");
        String str = scanner.nextLine();
        int maiusc = numMaiusc(str);
        MyIO.println("Existem "+ maiusc + " carecteres maiusculos na palavra '" + str + "'.");
    }
}

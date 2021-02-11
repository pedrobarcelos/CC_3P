import java.util.Scanner;

public class exercicio44 {
    
    public static int numLetras(String str){
        int letras = 0;
        int naoLetras = 0;
        for (int i = 0; i < str.length(); i++){
            if((str.charAt(i) >= 60 && str.charAt(i) <= 90) || (str.charAt(i) >= 97 && str.charAt(i) <= 122)){
                letras++;
            }
            else naoLetras++;
        }
        return letras;
    }

    public static int naoLetras(String str){
        int letras = 0;
        int naoLetras = 0;
        for (int i = 0; i < str.length(); i++){
            if((str.charAt(i) >= 60 && str.charAt(i) <= 90) || (str.charAt(i) >= 97 && str.charAt(i) <= 122)){
                letras++;
            }
            else naoLetras++;
        }
        return naoLetras;
    }

    public static int isVogal(String str){
        str = str.toLowerCase();
        int vogal = 0;
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(c == 32) continue;
            if(c == 97 | c == 101 | c == 105 | c == 111 | c == 117){
                vogal++;
                continue;
            }
            //if(c >= 98 && c <= 122) cons++;
        }
        return vogal;
    }

    public static int isCons(String str){
        str = str.toLowerCase();
        int vogal = 0;
        int cons = 0;
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(c == 32) continue;
            if(c == 97 | c == 101 | c == 105 | c == 111 | c == 117){
                vogal++;
                continue;
            }
            if(c >= 98 && c <= 122) cons++;
        }
        return cons;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyIO.println("Insira uma palavra: ");
        String str = scanner.nextLine();
        MyIO.println("RELATORIO - PALAVRA '" + str + "' " + 
                    "\nNumero de caracteres: " + str.length() + 
                    "\nNumero de letras:" + numLetras(str) + 
                    "\nNumero de nao letras: " + naoLetras(str) +
                    "\nNumero de vogais: " + isVogal(str) +
                    "\nNumero de consoantes " + isCons(str));
    }    
}

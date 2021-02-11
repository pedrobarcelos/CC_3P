import java.util.Scanner;

public class exercicio41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean resp = true;

        for (int i = 0; i < str.length()/2; i++){ 
            if (str.charAt(i) != str.charAt(str.length() - i - 1)){ 
                resp = false; 
                i = str.length(); 
            } 
        } 
        System.out.println(resp);
    }
}

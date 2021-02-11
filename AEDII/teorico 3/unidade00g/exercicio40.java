import java.util.Scanner;

public class exercicio40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int num = 0, tmp;

        for (int i = 0; i < str.length(); i++){ 
            tmp = (int)(str.charAt(i) - 48); 
            tmp *= (int)Math.pow(10, str.length() - i - 1); 
            num += tmp; 
        } 
        System.out.println(num);
    }
}

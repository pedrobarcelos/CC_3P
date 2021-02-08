public class exercicio16 {
    public static int fibRec(int n) {
        int resp;
        resp = (n == 0 || n == 1) ? 1 : fibRec(n - 1) + fibRec(n - 2);
        return resp;
    }

    public static void main(String[] args) {
        int n = MyIO.readInt();
        for(int i = 0; i <n;i++){
            System.out.println(fibRec(i));
        }
    }
}

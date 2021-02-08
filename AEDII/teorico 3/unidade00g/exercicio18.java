public class exercicio18 {
    public static void main(String[] args) {
        //declaracao
        int n = MyIO.readInt("N = ");

        //soma
        for (int i = 0; i < n; i++){
            if(2*i+1 < n)MyIO.println(i + " + " + (2*i+1) + " = " + (i + (2*i+1)));
        }
    }
}

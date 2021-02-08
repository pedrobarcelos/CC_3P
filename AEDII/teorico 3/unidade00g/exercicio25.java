public class exercicio25 {
    public static void main(String[] args) {
        int n = MyIO.readInt("Insira N:");
        int[] array = new int[n];
        boolean ehPar = (n%2==0);
        
        //leitura
        for(int i = 0; i < n; i++){
            array[i] = MyIO.readInt();
            if(ehPar && i%2==1)MyIO.println(array[i-1] + " + " + array[i] + " = " + (array[i-1]+array[i]));
        }
    }
}

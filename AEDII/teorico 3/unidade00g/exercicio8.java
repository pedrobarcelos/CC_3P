public class exercicio8 {
    public static double log(double base, double valor) {
        return Math.log(valor) / Math.log(base);
    }
    public static void main(String[] args) {
        //declaracao
        double num1, num2;
         
        //leitura
        num1 = MyIO.readDouble();
        num2 = MyIO.readDouble();
    
        //calculos e resultados
        if(num1 > num2) {
            MyIO.println(Math.pow(num2, 1.0/3));
            MyIO.println(log(num1, num2));
        }
        else{
            MyIO.println(Math.pow(num1, 1.0/3));
            MyIO.println((log(num2, num1)));
        }        
    }
}

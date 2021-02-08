//slide 105
public class exercicio2 {
    public static void main(String[] args) {

        //declaracao de variaveis
        boolean equilatero = false;
        boolean isosceles = false;
        boolean escaleno = false;
        double lados[] = {0,0,0};
        
        //leitura
        MyIO.println("Insira 3 lados de um triângulo por vez: ");
        for(int i = 0; i < lados.length; i++){
            MyIO.println("Lado " + (i+1) + ":");
            lados[i] = MyIO.readDouble();
        }

        //teste para triangulo equilatero
        for(int i = 0; i < lados.length - 1; i++){
            if(lados[i] == lados[i+1])equilatero = true;
            else {
                i = lados.length;
                equilatero = false;
            }
        }

        //teste para triangulo isosceles
        if((lados[0] == lados[1] && lados[2] != lados[1]) ||
           (lados[1] == lados[2] && lados[0] != lados[1]) ||
           (lados[2] == lados[0] && lados[1] != lados[2]))isosceles = true;
        
        //teste para triangulo escaleno
        for(int i = 0; i < lados.length - 1; i++){
            if(lados[i] != lados[i+1])escaleno = true;
            else {
                i = lados.length;
                escaleno = false;
            }
        }

        //RESULTADOS
        MyIO.println("\nTeste para triangulo equilatero: " + equilatero);
        MyIO.println("Teste para triangulo isosceles: " + isosceles);
        MyIO.println("Teste para triangulo escaleno: " + escaleno);
    }
}

public class exercicio5 {
    public static void main(String[] args) {
        //declaracao
        int numbers[] = {0,0};

        //leitura
        for (int i = 0; i < 2; i++){
            numbers[i] = MyIO.readInt();
        }

        //testes e resultados
        boolean greater45;
        boolean less20;
        boolean less10;
        int result;
        greater45 = (numbers[0] > 45 || numbers[1] > 45);
        less20 = (!greater45 && numbers[0] < 20 && numbers[1] < 20);
        less10 = (!less20 && ((numbers[0] < 10 && numbers[1] != 0) || (numbers[1] < 10 && numbers[0] != 0)));
        if(greater45) {
            result = numbers[0] + numbers[1];
            MyIO.println(result);
        }
        else if(less20) {
             result = (numbers[0] > numbers[1]) ? (numbers[0] - numbers[1]) : (numbers[1] - numbers[0]);
             MyIO.println(result);
        }
        else if(less10) { 
            result = (numbers[0] / numbers[1]);
            MyIO.println(result);
        }
        else MyIO.println("\nPedro Henrique Barcelos");
    }
}

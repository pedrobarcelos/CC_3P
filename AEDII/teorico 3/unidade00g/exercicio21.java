public class exercicio21 {
    public static void main(String[] args) {
        // declaracao
        int array[] = { 1, 2, 3, 4, 5 };
        int array_[] = { 5, 6, 7, 8, 9, 10 };

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array_.length; j++) {
                if (array[i] == array_[j]) {
                    MyIO.println("Intersecao: " + array[i]);
                }
            }
        }

        MyIO.println("uniao:");
        for (int i = 0; i < array.length; i++) {
            MyIO.print(array[i] + ", ");
            if (i == array.length - 1){
                for (int j = 0; j < array_.length; j++) {
                    MyIO.print(array_[j] + ", ");
                }
            }
        }
    }
}

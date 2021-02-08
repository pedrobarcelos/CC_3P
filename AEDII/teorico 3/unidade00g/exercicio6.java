public class exercicio6 {
    public static void main(String[] args) {
        //declaracao
        int home; int visitors; String winner = "";
        
        //leitura
        MyIO.println("Insira os gols do mandante:");
        home = MyIO.readInt();
        MyIO.println("Insira os gols do visitante");
        visitors = MyIO.readInt();

        //testes
        winner = (home > visitors) ? "Mandante" : "Visitante";
        if(home == visitors) winner = "Empate";

        //resultados
        if(winner != "Empate")MyIO.println("Vencedor: " + winner);
        else MyIO.println("Empate.");

    }
}

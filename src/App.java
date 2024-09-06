import java.util.Scanner;

public class App{
    public static double calcularVelocidadeMedia(String[] velocidades) {
        int total = 0;
        int cont = 0;
        String mensagem = "";

        /*for (String v : velocidades) {
            total += Integer.parseInt(v);
            cont++;
        }*/

        for (String v : velocidades) {
            if(v.equals("0")){
                mensagem = "Queda de Conexao";
            }else{
                mensagem = "Sem Quedas";
            }
        }
        
        return 0;
    }

    public static String verificarQuedaConexao(String[] velocidades){
        String mensagem = "";
        for (String v : velocidades) {
            int vel = Integer.parseInt(v);
            if(vel == 0){
                mensagem = "Queda de Conexao";
                break;
            }else{
                mensagem = "Sem Quedas";
            }
        }
        
        return mensagem;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário a lista de velocidades de conexão registradas a cada hora
        String input = scanner.nextLine();

        // Convertendo a entrada em uma lista de strings
        String[] velocidades = input.split(",");

        // Calculando a velocidade média de conexão
        //double velocidadeMedia = calcularVelocidadeMedia(velocidades);

        // Exibindo a velocidade média de conexão
        //System.out.println((int)velocidadeMedia + " Mbps");

        scanner.close();

          // Verificando se houve queda de conexão
          String resultado = verificarQuedaConexao(velocidades);

          // Exibindo o resultado da verificação
          System.out.println(resultado);
    }
}
    


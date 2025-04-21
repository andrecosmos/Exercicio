import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        EntradaDados dados = new EntradaDados();

        List<Carro> carros = new ArrayList<>();

        boolean continuar = true;

        while (continuar) {
            Carro carro = dados.cadastraCarro();
            carros.add(carro);

            System.out.print("\nDeseja cadastrar outro carro? (s/n): ");
            String resposta = dados.lerTela().toLowerCase();
            continuar = resposta.equals("s");
        }

        dados.fecharScanner();

        System.out.println("\n************ Carros cadastrados !! ***********");
        for (Carro c : carros) {
            c.exibirCarro();
            System.out.println("Tempo de uso : " + c.calculaIdade() + " anos");
            System.out.println("-----------------------------");
        }

        SalvarArquivo.salvarCarros(carros, "carros.csv");

    }
}
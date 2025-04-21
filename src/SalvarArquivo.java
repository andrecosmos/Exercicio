import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class SalvarArquivo {

        public static void salvarCarros(List<Carro> carros, String nomeArquivo) {
        try (FileWriter writer = new FileWriter(nomeArquivo)) {
            writer.append("codigo,marca,modelo,ano,cor,licenciado\n");

            for (Carro carro : carros) {
                writer.append(String.valueOf(carro.getCodigo())).append(",");
                writer.append(carro.getMarca()).append(",");
                writer.append(carro.getModelo()).append(",");
                writer.append(String.valueOf(carro.getAno())).append(",");
                writer.append(carro.getCor()).append(",");
                writer.append(carro.getLicenciado() ? "Sim" : "Não").append("\n");
            }

            System.out.println("\nArquivo CSV salvo com sucesso: " + nomeArquivo);
        } catch (IOException e) {
            System.out.println("Erro ao salvar o arquivo CSV: " + e.getMessage());
        }
    }
}

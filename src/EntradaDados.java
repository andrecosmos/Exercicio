import java.util.Scanner;

public class EntradaDados {
    private final Scanner scanner;

    public EntradaDados() {
        this.scanner = new Scanner(System.in);
    }

    public String lerTela() {
        return scanner.nextLine();
    }

    public Carro cadastraCarro(){

        System.out.print("Código do Veículo : ");
        int codigo = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Marca do veículo: ");
        String marca = scanner.nextLine();

        System.out.print("Modelo do veículo : ");
        String modelo = scanner.nextLine();

        System.out.print("Ano de fabricação : ");
        int ano = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Qual a Cor : ");
        String cor = scanner.nextLine();

        System.out.print("Está licenciado? (s/n): ");
        String lic = scanner.nextLine().toLowerCase();
        boolean licenciado = lic.equals("s");

        return new Carro(codigo,marca,modelo, ano, cor, licenciado);




    }


    public void fecharScanner() {
    }
}

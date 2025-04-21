import java.time.Year;

public class Carro {
    private int codigo ;
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private Boolean licenciado;

    public Carro(int codigo,String marca, String modelo, int ano, String cor, Boolean licenciado) {
        this.codigo = codigo;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.licenciado = licenciado;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Boolean getLicenciado() {
        return licenciado;
    }

    public void setLicenciado(Boolean licenciado) {
        this.licenciado = licenciado;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "codigo=" + codigo +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                ", cor='" + cor + '\'' +
                ", licenciado=" + licenciado +
                '}';
    }


    public void exibirCarro(){

        System.out.println("Código do veículo : " + getCodigo());
        System.out.println("Fabricante  : " + getMarca());
        System.out.println("Modelo veículo : " + getModelo());
        System.out.println("Ano do veículo : " + getAno());
        System.out.println("Cor do veículo : " + getCor());
        System.out.println("Licenciado : " + getLicenciado());

    }

    int calculaIdade(){
        return Year.now().getValue() - ano;
    }
}

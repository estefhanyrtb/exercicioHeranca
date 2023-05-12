package exercicio02;

public class Moto extends Veiculo {

    private boolean possuiPartidaEletrica;

    public Moto(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
        this.possuiPartidaEletrica = possuiPartidaEletrica;

    }

    public boolean isPossuiPartidaEletrica() {
        return possuiPartidaEletrica;
    }

    public void setPossuiPartidaEletrica(boolean possuiPartidaEletrica) {
        this.possuiPartidaEletrica = possuiPartidaEletrica;
    }

    @Override
    public double calcularVelocidadeMaxima() {
        return 180.0;
    }

    public String exibirDetalhes() {
        return "Moto{" + super.exibirDetalhes() + "possuiPartidaEletrica" + possuiPartidaEletrica + '}';
    }
}

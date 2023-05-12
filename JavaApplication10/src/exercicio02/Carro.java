
package exercicio02;

public class Carro extends Veiculo {
   
    private int numeroPortas;
    
     public Carro(int numeroPortas, String marca, String modelo, int ano) {
        super(modelo,marca,ano);
        this.numeroPortas = numeroPortas;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    @Override
    public double calcularVelocidadeMaxima() {
        return 200.0;
    }
    public String exibirDetalhes() {
        return "Carro{" +super.exibirDetalhes()+"numeroPortas" + numeroPortas + '}';
    }
}

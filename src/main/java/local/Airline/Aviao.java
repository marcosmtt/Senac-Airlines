package local.Airline;

public class Aviao {

    private String modelo;
    private double velocidade;
    private int capacidadePessoas;
    private int capacidadeBagagem;

    @Override
    public String toString() {
        return String.format("Modelo: " + modelo + "\nCapacidade de Passageiros: " + capacidadePessoas
                + "\nCapacidade de Bagagens: " + capacidadeBagagem);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public int getCapacidadePessoas() {
        return capacidadePessoas;
    }

    public void setCapacidadePessoas(int capacidadePessoas) {
        this.capacidadePessoas = capacidadePessoas;
    }

    public int getCapacidadeBagagem() {
        return capacidadeBagagem;
    }

    public void setCapacidadeBagagem(int capacidadeBagagem) {
        this.capacidadeBagagem = capacidadeBagagem;
    }

}

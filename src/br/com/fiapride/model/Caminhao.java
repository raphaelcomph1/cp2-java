package br.com.fiapride.model;

public class Caminhao extends Veiculo{
    private int qtdEixos;
    public Caminhao(String placa, double pesoSuportado, int qtdEixos){
        super(placa, pesoSuportado);
        this.qtdEixos = qtdEixos;
    }
    public int getQtdEixos() {
        return qtdEixos;
    }
}
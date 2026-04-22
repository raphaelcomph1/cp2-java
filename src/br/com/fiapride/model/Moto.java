package br.com.fiapride.model;

public class Moto extends Veiculo{
    private boolean hasBau;
    public Moto(String placa, double pesoSuportado, boolean hasBau){
        super(placa, pesoSuportado);
        this.hasBau = hasBau;
    }
    public boolean getHasBau(){
        return hasBau;
    }
}
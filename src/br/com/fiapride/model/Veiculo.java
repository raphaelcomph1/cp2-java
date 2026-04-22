package br.com.fiapride.model;

//Representa um veículo de entrega do FiapDelivery.
public class Veiculo{
    private String placa;
    private double pesoSuportado;
    public Veiculo(String placa, double pesoSuportado){
        this.placa = placa;
        this.setPesoSuportado(pesoSuportado);
    }
    public String getPlaca(){
        return placa;
    }

    public double getPesoSuportado(){
        return pesoSuportado;
    }

    public void setPesoSuportado( double pesoSuportado){
        if(pesoSuportado < 0){
            System.out.println("Digite um valor positivo");
            this.pesoSuportado = 0;
            return;
        }
        this.pesoSuportado = pesoSuportado;
    }
}
package br.com.fiapride.model;
//Representa um pacote a ser entregue do FiapDelivery.

public class Pacote {
    private String codigoEntrega;
    private double pesoProduto;
    private String estadoEntrega;
    public Pacote(String codigoEntrega, double pesoProduto, String estadoEntrega){
        this.codigoEntrega = codigoEntrega;
        this.pesoProduto = pesoProduto;
        this.estadoEntrega = estadoEntrega;

    }
    public String getCodigoEntrega(){
        return codigoEntrega;
    }
    public double getPesoProduto(){
        return pesoProduto;
    }
    public String getEstadoEntrega() {
        return estadoEntrega;
    }
    public void mudarEstado(String novoEstado){
        estadoEntrega = novoEstado;
    }
}
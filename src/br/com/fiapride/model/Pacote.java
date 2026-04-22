package br.com.fiapride.model;

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
    public void mudarEstado(String novoEstado){
        estadoEntrega = novoEstado;
    }
}
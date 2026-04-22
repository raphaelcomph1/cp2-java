package br.com.fiapride.model;

public class Rota{
    private Pacote pacote;
    private Veiculo veiculo;

    public Rota(Pacote pacote, Veiculo veiculo){
        this.pacote = pacote;
        this.veiculo = veiculo;
    }
    public void comparacaoPeso(){
        if(pacote.getPesoProduto() > veiculo.getPesoSuportado()){
            System.out.println("Este processo nao pode ser realizado por excesso de carga no pacote");
            return;
        }
        caminho();
    }
    public void caminho(){
        System.out.println("Levando pacote " + pacote.getCodigoEntrega() + " no veiculo " + veiculo.getPlaca());
    }
}
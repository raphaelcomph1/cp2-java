package br.com.fiapride.main;

import br.com.fiapride.model.Caminhao;
import br.com.fiapride.model.Pacote;
import br.com.fiapride.model.Rota;

public class Main {
    public static void main(String[] args) {
        Caminhao caminhao1 = new Caminhao("ABC1234",  - 500.0, 0);
        Pacote pacote1 = new Pacote("BR999", 10.5, "Pendente");
        Rota rota1 = new Rota(pacote1, caminhao1);
        rota1.comparacaoPeso();
    }
}

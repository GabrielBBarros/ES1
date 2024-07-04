package Model;

import java.util.ArrayList;
import java.util.List;

public class Cozinha {
    private List<Prato> pratos;

    public Cozinha() {
        this.pratos = new ArrayList<>();
    }

    public void addPrato(Prato prato) {
        pratos.add(prato);
    }
    
    public void removerPrato(Prato prato) {
        pratos.remove(prato);
    }

    public void listarPratos() {
        System.out.println("Lista de Pratos na Cozinha:");
        for (Prato prato : pratos) {
            System.out.println("Nome: " + prato.getNome());
            System.out.println("Descri��o: " + prato.getDescricao());
            System.out.println("Pre�o: " + prato.getPreco());
            System.out.println("--------------------------");
        }
    }
}

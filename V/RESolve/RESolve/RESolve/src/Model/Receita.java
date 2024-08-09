package Model;

import java.util.List;

public class Receita {
    private List<Item> itens;

    public Receita(List<Item> itens) {
        this.itens = itens;
    }

    public List<Item> getItens() {
        return itens;
    }

    public boolean verificarItem(Estoque estoque) {
        for (Item item : itens) {
            if (!estoque.verificarItem(item)) {
                return false;
            }
        }
        return true;
    }

    public void descontarItem(Estoque estoque) {
        for (Item item : itens) {
            estoque.descontarItem(item, 1);  // Assuming 1 unit per item per recipe
        }
    }

}

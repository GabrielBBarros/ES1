package Model;

import java.util.Map;

public class VisualizadorEstoque {
    private Estoque estoque;

    public VisualizadorEstoque(Estoque estoque) {
        this.estoque = estoque;
    }

    public void mostrarItensEstoque() {
        System.out.println("Itens em Estoque:");

        for (Ingrediente ingrediente : estoque.getIngredientes().values()) {
        	if (ingrediente.getQuantidade() > 0) {
                System.out.println("- " + ingrediente.getNome() + ": " + ingrediente.getDescricao() + " (" + ingrediente.getQuantidade() + " " + ingrediente.getUnidade() + ")");
            }
        }

        for (ItemEspecialBebida item : estoque.getItensEspeciaisBebida().values()) {
        	if (item.getQuantidade() > 0) {
                System.out.println("- " + item.getNome() + ": " + item.getDescricao() + " (" + item.getQuantidade() + " " + item.getUnidade() + ")");
            }
        }
    }
}

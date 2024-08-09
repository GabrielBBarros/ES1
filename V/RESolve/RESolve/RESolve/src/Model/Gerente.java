package Model;

import java.util.List;

public class Gerente {
    private Estoque estoque;
    private String senha;

    public boolean autenticar(String senha) {
        return this.senha.equals(senha);
    }

    public Prato criarPrato(String nome, double preco, String descricao, List<Item> itens, String senha) {
        if (autenticar(senha)) {
            return new Prato(nome, preco, descricao, itens);
        }
        return null;
    }

    public Bebida criarBebida(String nome, double preco, String descricao, List<Item> itens, String senha) {
        if (autenticar(senha)) {
            return new Bebida(nome, preco, descricao, itens);
        }
        return null;
    }

    public void mostrarItens() {
        System.out.println("=== Itens do Estoque ===");
        for (Item item : estoque.getItens()) {
            System.out.println(item.getNome() + ": " + item.getQuantidade() + " unidades");
        }
    }

    public void mostrarItensFaltantes() {
        System.out.println("=== Itens em Falta ===");
        for (Item item : estoque.getItens()) {
            if (item.getQuantidade() <= 0) {
                System.out.println(item.getNome() + ": Produto em falta");
            }
        }
    }
}

package Model;

import java.util.ArrayList;
import java.util.List;

public class Bebida {
    private String nome;
    private double preco;
    private String descricao;
    private Estoque estoque;
    private List<ItemEspecialBebida> itensEspeciais;

    public Bebida(String nome, double preco, String descricao, Estoque estoque, List<ItemEspecialBebida> itensEspeciais) throws ItemEspecialInsuficienteException {
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
        this.estoque = estoque;
        this.itensEspeciais = new ArrayList<>(itensEspeciais);

        if (!estoque.verificarItensEspeciais(itensEspeciais)) {
            throw new ItemEspecialInsuficienteException("Itens especiais insuficientes para a bebida: " + nome);
        }

        estoque.descontarItensEspeciais(itensEspeciais);
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public List<ItemEspecialBebida> getItensEspeciais() {
        return itensEspeciais;
    }

    public void addItemEspecialBebida(ItemEspecialBebida item) {
        itensEspeciais.add(item);
    }

    public void removeItemEspecialBebida(ItemEspecialBebida item) {
        itensEspeciais.remove(item);
    }
}
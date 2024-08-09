package Model;

import java.util.List;

public class Bebida {
    private String nome;
    private double preco;
    private String descricao;
    private Estoque estoque;
    private Item item;

    public Bebida(String nome, double preco, String descricao, Estoque estoque, Item item) {
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
        this.estoque = estoque;
        this.item = item;
    }

    public Bebida(String nome2, double preco2, String descricao2, List<Item> itens) {
		// TODO Auto-generated constructor stub
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

    public boolean verificarItem() {
        return estoque.verificarItem(item);
    }

    public void descontarItem() {
        estoque.descontarItem(item, 1);  
    }

}

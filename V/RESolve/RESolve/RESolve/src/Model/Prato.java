package Model;

import java.util.List;

public class Prato {
    private String nome;
    private double preco;
    private String descricao;
    private Estoque estoque;
    private Receita receita;

    public Prato(String nome, double preco, String descricao, Estoque estoque, Receita receita) {
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
        this.estoque = estoque;
        this.receita = receita;
    }

    public Prato(String nome2, double preco2, String descricao2, List<Item> itens) {
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

    public Receita getReceita() {
        return receita;
    }

    public boolean verificarItem() {
        return receita.verificarItem(estoque);
    }

    public void descontarItem() {
        receita.descontarItem(estoque);
    }

}

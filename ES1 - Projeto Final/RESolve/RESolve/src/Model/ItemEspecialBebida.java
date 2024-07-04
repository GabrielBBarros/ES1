package Model;

public class ItemEspecialBebida {
    private String nome;
    private String descricao;
    private int quantidade;
    private String unidade;

    public ItemEspecialBebida(String nome, String descricao, int quantidade, String unidade) {
        this.nome = nome;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.unidade = unidade;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}

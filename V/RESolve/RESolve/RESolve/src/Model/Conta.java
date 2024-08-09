package Model;

import java.util.ArrayList;
import java.util.List;

public class Conta {
    private Mesa mesa;
    private String metodoDePagamento;
    private boolean paga;
    private List<Pedido> pedidos;

    public Conta(Mesa mesa, String metodoDePagamento) {
        this.mesa = mesa;
        this.metodoDePagamento = metodoDePagamento;
        this.pedidos = new ArrayList<>();
        this.paga = false;
    }

    public int addPedido(Pedido pedido) {
        pedidos.add(pedido);
        return pedido.getNumero();
    }

    public boolean estaPaga() {
        return paga;
    }

    public void mensagemEstadoConta() {
        if (paga) {
            System.out.println("A conta da mesa " + mesa.getNumero() + " já foi paga.");
        } else {
            System.out.println("A conta da mesa " + mesa.getNumero() + " ainda não foi paga.");
        }
    }

    public void calcularValorTotal() {
        double valorTotal = 0.0;
        for (Pedido pedido : pedidos) {
            valorTotal += pedido.calcularValor();
        }
        System.out.println("O valor total da conta da mesa " + mesa.getNumero() + " é: R$" + valorTotal);
    }

    public void setPaga(boolean paga) {
        this.paga = paga;
    }

	public Mesa getMesa() {
		return mesa;
	}

	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}

	public String getMetodoDePagamento() {
		return metodoDePagamento;
	}

	public void setMetodoDePagamento(String metodoDePagamento) {
		this.metodoDePagamento = metodoDePagamento;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	public boolean isPaga() {
		return paga;
	}

   
}

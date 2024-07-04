package Model;

import java.util.List;
import java.util.ArrayList;

public class Conta {
    private List<Pedido> pedidos;
    private Mesa mesa;
    private String metodoDePagamento;
    private boolean paga;

    public Conta(Mesa mesa) {
        this.pedidos = new ArrayList<>();
        this.mesa = mesa;
        this.paga = false;
    }

    public void addPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMetodoDePagamento(String metodoDePagamento) {
        this.metodoDePagamento = metodoDePagamento;
    }

    public String getMetodoDePagamento() {
        return metodoDePagamento;
    }

    public double calcularValorTotal() {
        double total = 0.0;
        for (Pedido pedido : pedidos) {
            for (Prato prato : pedido.getPratosPedidos().getPratos()) {
                total += prato.getPreco();
            }
            for (Bebida bebida : pedido.getBebidasPedidos().getBebidas()) {
                total += bebida.getPreco();
            }
        }
        return total;
    }

    public boolean estaPaga() {
        return paga;
    }

    public void setPaga(boolean paga) {
        this.paga = paga;
    }
    
    public String mensagemEstadoConta() {
        if (paga) {
            return "A conta est� paga.";
        } else {
            return "A conta ainda n�o est� paga.";
        }
    }
}

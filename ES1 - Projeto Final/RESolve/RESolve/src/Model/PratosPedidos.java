package Model;

import java.util.ArrayList;
import java.util.List;

public class PratosPedidos {
    private Pedido pedido;
    private List<Prato> pratos;

    public PratosPedidos(Pedido pedido) {
        this.pedido = pedido;
        this.pratos = new ArrayList<>();
    }

    public Pedido getPedido() {
        return pedido;
    }

    public List<Prato> getPratos() {
        return pratos;
    }

    public void addPrato(Prato prato) {
        pratos.add(prato);
    }
}

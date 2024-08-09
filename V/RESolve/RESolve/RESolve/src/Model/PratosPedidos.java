package Model;

import java.util.ArrayList;
import java.util.List;

public class PratosPedidos {
    private int pedido;
    private List<Prato> pratos;

    public PratosPedidos() {
        pratos = new ArrayList<>();
    }

    public int addPrato(Prato prato) {
        pratos.add(prato);
        return pedido;
    }

    public List<Prato> getPratos() {
        return pratos;
    }
}

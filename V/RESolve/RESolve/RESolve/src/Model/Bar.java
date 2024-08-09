package Model;

import java.util.ArrayList;
import java.util.List;

public class Bar {
    private List<Bebida> bebidas;

    public void listarBebidas() {
        for (Bebida bebida : bebidas) {
            System.out.println(bebida);
        }
    }
}

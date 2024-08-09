package Model;

import java.util.ArrayList;
import java.util.List;

public class Cozinha {
    private List<Prato> pratos;

    public void listarPratos() {
        for (Prato prato : pratos) {
            System.out.println(prato);
        }
    }
}

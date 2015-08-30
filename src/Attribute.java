/**
 * Created by Nico on 8/26/15.
 */
public class Attribute {
    String name;
    int valor;

    public Attribute(String name, int valor) {
        this.name = name;
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}

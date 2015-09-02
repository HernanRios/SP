/**
 * Created by Nico on 8/26/15.
 */
public class Attribute {
    private String name;
    private int valor;
    private boolean highestWins;

    public Attribute(String name, int valor, boolean highestWins) {
        this.name = name;
        this.valor = valor;
        this.highestWins = false;
    }

    public int getValor() {
        return valor;
    }

    public String getName() {
        return name;
    }

    public boolean getWinType() {
        return this.highestWins;
    }

    public void setWinType(Boolean highestWins) {
        this.highestWins = highestWins;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}

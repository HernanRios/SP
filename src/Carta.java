import java.util.ArrayList;
import java.util.Iterator;
/**
 * Created by Nico on 8/26/15.
 */
public class Carta {
    String name;
    ArrayList<Atributo> attributes = new ArrayList<Atributo>();
    public Carta() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAttributtes(Atributo attributtes) {
        this.attributes = attributes;
    }

    public void setAttribute(String name, int value) {
        if (this.attributes.size() <=7) {
            Atributo newAttribute = new Atributo(name, value);
            this.attributes.add(newAttribute);
        }
    }

    public int getAttribute(String attribute) {
        if (!this.attributes.isEmpty()) { //if the array isn't empty.
            Iterator<Atributo> iterator = attributes.iterator(); //creo el iterador
            while (iterator.hasNext()) { //itero
                if (attribute == iterator.next().getName()){ //pregunto si el valor siguiente es igual al valor que busco
                    return iterator.next().getValor(); //retorno el numero del valor que necesito
                }
            }
        }
        return 0;//si no retorno 0
    }
}

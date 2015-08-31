import java.util.ArrayList;
import java.util.Iterator;
/**
 * Created by Nico on 8/26/15.
 */
public class Card {
    String name;
    ArrayList<Attribute> attributes = new ArrayList<Attribute>();
    public Card() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAttributtes(ArrayList<Attribute> attributtes) {
        this.attributes = attributes;
    }

    public void setAttribute(String name, int value) {
        if (this.attributes.size() <=7) {
            Attribute newAttribute = new Attribute(name, value, false);
            this.attributes.add(newAttribute);
        }
    }

    public int getAttribute(String attribute) {
        if (!this.attributes.isEmpty()) { //if the array isn't empty.
            Iterator<Attribute> iterator = attributes.iterator(); //build the iterator.
            while (iterator.hasNext()) {
                if (attribute == iterator.next().getName()){
                    return iterator.next().getValor();
                }
            }
        }
        return 0;
    }

    public ArrayList<Attribute> getAttributes(){
        return this.attributes;
    }
}

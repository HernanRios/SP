import java.util.ArrayList;
import java.util.Iterator;
/**
 * Created by Nico on 8/26/15.
 */
public class Card {
    private String name;
    private ArrayList<Attribute> attributes = new ArrayList<Attribute>();
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

    public void setAttribute(String name, int value, int condition) {
        if (this.attributes.size() <=7) {
            Attribute newAttribute = new Attribute(name, value, condition);
            this.attributes.add(newAttribute);
        }
    }

    public int getAttribute(int attribute) {
        if (!this.attributes.isEmpty()) {
            return this.attributes.get(attribute).getValor();
        } else
            return -1;
    }

    public int getAttributeCondition(int attribute) {
        if (!this.attributes.isEmpty()) {
            return this.attributes.get(attribute).getWinType();
        } else
            return 1;
    }

    public ArrayList<Attribute> getAttributes() {
        return this.attributes;
    }

    public int getAttributesAmount() {
        return attributes.size();
    }
}
